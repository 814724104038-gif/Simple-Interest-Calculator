package com.si.calculator;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/calculate")
public class SimpleInterestServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    public SimpleInterestServlet() {
        super();
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Get parameters from HTML form
        String principalStr = request.getParameter("principal");
        String rateStr = request.getParameter("rate");
        String timeStr = request.getParameter("time");
        
        // HTML Header with styling
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>Simple Interest Result</title>");
        out.println("<style>");
        out.println("    * {");
        out.println("        margin: 0;");
        out.println("        padding: 0;");
        out.println("        box-sizing: border-box;");
        out.println("        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;");
        out.println("    }");
        out.println("    body {");
        out.println("        background: linear-gradient(135deg, #6a11cb 0%, #2575fc 100%);");
        out.println("        min-height: 100vh;");
        out.println("        display: flex;");
        out.println("        justify-content: center;");
        out.println("        align-items: center;");
        out.println("        padding: 20px;");
        out.println("    }");
        out.println("    .container {");
        out.println("        background: white;");
        out.println("        border-radius: 20px;");
        out.println("        box-shadow: 0 15px 35px rgba(0, 0, 0, 0.2);");
        out.println("        width: 100%;");
        out.println("        max-width: 500px;");
        out.println("        padding: 40px;");
        out.println("    }");
        out.println("    h2 {");
        out.println("        color: #2d3436;");
        out.println("        text-align: center;");
        out.println("        margin-bottom: 30px;");
        out.println("        padding-bottom: 15px;");
        out.println("        border-bottom: 3px solid #6a11cb;");
        out.println("    }");
        out.println("    .input-details {");
        out.println("        background: #f8f9fa;");
        out.println("        border-radius: 10px;");
        out.println("        padding: 25px;");
        out.println("        margin-bottom: 30px;");
        out.println("    }");
        out.println("    .detail-row {");
        out.println("        display: flex;");
        out.println("        justify-content: space-between;");
        out.println("        margin-bottom: 15px;");
        out.println("        padding-bottom: 10px;");
        out.println("        border-bottom: 1px solid #e9ecef;");
        out.println("    }");
        out.println("    .detail-label {");
        out.println("        font-weight: 600;");
        out.println("        color: #495057;");
        out.println("    }");
        out.println("    .detail-value {");
        out.println("        color: #2d3436;");
        out.println("        font-weight: 700;");
        out.println("    }");
        out.println("    .formula {");
        out.println("        background: #e3f2fd;");
        out.println("        padding: 15px;");
        out.println("        border-radius: 8px;");
        out.println("        text-align: center;");
        out.println("        margin: 20px 0;");
        out.println("        font-family: 'Courier New', monospace;");
        out.println("        font-size: 18px;");
        out.println("        color: #1976d2;");
        out.println("    }");
        out.println("    .result-section {");
        out.println("        background: linear-gradient(135deg, #00b09b 0%, #96c93d 100%);");
        out.println("        border-radius: 15px;");
        out.println("        padding: 25px;");
        out.println("        color: white;");
        out.println("        text-align: center;");
        out.println("        margin: 25px 0;");
        out.println("    }");
        out.println("    .result-title {");
        out.println("        font-size: 18px;");
        out.println("        margin-bottom: 10px;");
        out.println("        opacity: 0.9;");
        out.println("    }");
        out.println("    .result-value {");
        out.println("        font-size: 32px;");
        out.println("        font-weight: 800;");
        out.println("        margin: 10px 0;");
        out.println("    }");
        out.println("    .total-amount {");
        out.println("        font-size: 22px;");
        out.println("        margin-top: 15px;");
        out.println("        font-weight: 700;");
        out.println("    }");
        out.println("    .error-box {");
        out.println("        background: #ffebee;");
        out.println("        border: 2px solid #f44336;");
        out.println("        border-radius: 10px;");
        out.println("        padding: 20px;");
        out.println("        text-align: center;");
        out.println("        color: #d32f2f;");
        out.println("        margin: 20px 0;");
        out.println("    }");
        out.println("    .back-btn {");
        out.println("        display: block;");
        out.println("        width: 100%;");
        out.println("        padding: 15px;");
        out.println("        background: linear-gradient(135deg, #6a11cb 0%, #2575fc 100%);");
        out.println("        color: white;");
        out.println("        text-align: center;");
        out.println("        text-decoration: none;");
        out.println("        border-radius: 10px;");
        out.println("        font-weight: 700;");
        out.println("        font-size: 16px;");
        out.println("        border: none;");
        out.println("        cursor: pointer;");
        out.println("        margin-top: 20px;");
        out.println("        transition: transform 0.3s, box-shadow 0.3s;");
        out.println("    }");
        out.println("    .back-btn:hover {");
        out.println("        transform: translateY(-3px);");
        out.println("        box-shadow: 0 10px 20px rgba(106, 17, 203, 0.3);");
        out.println("    }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class=\"container\">");
        out.println("<h2>💰 Simple Interest Calculation Result</h2>");
        
        try {
            // Parse input values
            double principal = Double.parseDouble(principalStr);
            double rate = Double.parseDouble(rateStr);
            double time = Double.parseDouble(timeStr);
            
            // Calculate Simple Interest
            double simpleInterest = (principal * rate * time) / 100;
            double totalAmount = principal + simpleInterest;
            
            // Display input details
            out.println("<div class=\"input-details\">");
            out.println("<div class=\"detail-row\">");
            out.println("<span class=\"detail-label\">Principal Amount (P):</span>");
            out.println("<span class=\"detail-value\">₹" + String.format("%,.2f", principal) + "</span>");
            out.println("</div>");
            
            out.println("<div class=\"detail-row\">");
            out.println("<span class=\"detail-label\">Rate of Interest (R):</span>");
            out.println("<span class=\"detail-value\">" + rate + "% per annum</span>");
            out.println("</div>");
            
            out.println("<div class=\"detail-row\">");
            out.println("<span class=\"detail-label\">Time Period (T):</span>");
            out.println("<span class=\"detail-value\">" + time + " years</span>");
            out.println("</div>");
            out.println("</div>");
            
            // Display formula
            out.println("<div class=\"formula\">");
            out.println("Formula: SI = (P × R × T) / 100");
            out.println("</div>");
            
            // Display results
            out.println("<div class=\"result-section\">");
            out.println("<div class=\"result-title\">Simple Interest Calculated:</div>");
            out.println("<div class=\"result-value\">₹" + String.format("%,.2f", simpleInterest) + "</div>");
            out.println("<div class=\"result-title\" style=\"margin-top: 20px;\">Total Amount (Principal + Interest):</div>");
            out.println("<div class=\"total-amount\">₹" + String.format("%,.2f", totalAmount) + "</div>");
            out.println("</div>");
            
            // Breakdown
            out.println("<div style=\"text-align: center; margin-top: 20px; color: #666;\">");
            out.println("<p><b>Breakdown:</b></p>");
            out.println("<p>Principal: ₹" + String.format("%,.2f", principal) + "</p>");
            out.println("<p>+ Interest: ₹" + String.format("%,.2f", simpleInterest) + "</p>");
            out.println("<p>= Total: ₹" + String.format("%,.2f", totalAmount) + "</p>");
            out.println("</div>");
            
        } catch (NumberFormatException e) {
            out.println("<div class=\"error-box\">");
            out.println("<h3 style=\"margin-bottom: 10px;\">⚠️ Invalid Input Detected</h3>");
            out.println("<p>Please enter valid numbers in all fields.</p>");
            out.println("<p>Example: Principal: 10000, Rate: 5.5, Time: 2.5</p>");
            out.println("</div>");
        } catch (NullPointerException e) {
            out.println("<div class=\"error-box\">");
            out.println("<h3 style=\"margin-bottom: 10px;\">⚠️ Missing Input Values</h3>");
            out.println("<p>All fields are required. Please go back and fill the form.</p>");
            out.println("</div>");
        } catch (Exception e) {
            out.println("<div class=\"error-box\">");
            out.println("<h3 style=\"margin-bottom: 10px;\">❌ Unexpected Error</h3>");
            out.println("<p>An error occurred: " + e.getMessage() + "</p>");
            out.println("</div>");
        }
        
        // Back button
     // Working Back Button - SIMPLE VERSION
     // Back button
     // SIMPLE WORKING BACK LINK
        out.println("<div style='text-align:center; margin:30px;'>");
        out.println("<a href='index.html' ");
        out.println("style='display:inline-block; padding:12px 24px; ");
        out.println("background-color:#4CAF50; color:white; text-decoration:none; ");
        out.println("border-radius:5px; font-size:16px; font-weight:bold;'>");
        out.println("← Back to Calculator");
        out.println("</a>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
        
        out.close();
    }
}
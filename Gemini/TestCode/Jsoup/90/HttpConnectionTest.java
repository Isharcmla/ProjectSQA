package org.jsoup.helper;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPOutputStream;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class HttpConnectionTest {

    private static HttpServer server;
    private static int serverPort;
    private static String serverUrl;

    @BeforeClass
    public static void setUpServer() throws IOException {
        server = HttpServer.create(new InetSocketAddress(0), 0);
        serverPort = server.getAddress().getPort();
        serverUrl = "http://localhost:" + serverPort;

        server.createContext("/echo", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                byte[] reqBytes = readAll(exchange.getRequestBody());
                String response = "echo:" + new String(reqBytes, StandardCharsets.UTF_8);
                exchange.getResponseHeaders().set("Content-Type", "text/html; charset=UTF-8");
                exchange.getResponseHeaders().add("Set-Cookie", "server_cookie=val123; Path=/");
                exchange.getResponseHeaders().add("Custom-Header", "Value1");
                exchange.getResponseHeaders().add("Custom-Header", "Value2");
                exchange.sendResponseHeaders(200, response.getBytes(StandardCharsets.UTF_8).length);
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes(StandardCharsets.UTF_8));
                os.close();
            }
        });

        server.createContext("/redirect", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                exchange.getResponseHeaders().set("Location", serverUrl + "/echo");
                exchange.getResponseHeaders().add("Set-Cookie", "redir_cookie=from_redirect; Path=/");
                exchange.sendResponseHeaders(302, -1);
                exchange.close();
            }
        });

        server.createContext("/broken-redirect", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                exchange.getResponseHeaders().set("Location", "http:/temp/path");
                exchange.sendResponseHeaders(302, -1);
                exchange.close();
            }
        });

        server.createContext("/temp-redirect", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                exchange.getResponseHeaders().set("Location", serverUrl + "/echo");
                exchange.sendResponseHeaders(307, -1);
                exchange.close();
            }
        });

        server.createContext("/redirect-loop", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                exchange.getResponseHeaders().set("Location", serverUrl + "/redirect-loop");
                exchange.sendResponseHeaders(302, -1);
                exchange.close();
            }
        });

        server.createContext("/error-404", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                byte[] msg = "Not Found".getBytes(StandardCharsets.UTF_8);
                exchange.getResponseHeaders().set("Content-Type", "text/html");
                exchange.sendResponseHeaders(404, msg.length);
                OutputStream os = exchange.getResponseBody();
                os.write(msg);
                os.close();
            }
        });

        server.createContext("/unsupported-mime", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                byte[] msg = new byte[]{0x01, 0x02, 0x03};
                exchange.getResponseHeaders().set("Content-Type", "application/octet-stream");
                exchange.sendResponseHeaders(200, msg.length);
                OutputStream os = exchange.getResponseBody();
                os.write(msg);
                os.close();
            }
        });

        server.createContext("/xml", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                byte[] msg = "<root><item>Hello</item></root>".getBytes(StandardCharsets.UTF_8);
                exchange.getResponseHeaders().set("Content-Type", "text/xml; charset=UTF-8");
                exchange.sendResponseHeaders(200, msg.length);
                OutputStream os = exchange.getResponseBody();
                os.write(msg);
                os.close();
            }
        });

        server.createContext("/gzip", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                GZIPOutputStream gzos = new GZIPOutputStream(baos);
                gzos.write("<html><body>Gzip Content</body></html>".getBytes(StandardCharsets.UTF_8));
                gzos.close();
                byte[] data = baos.toByteArray();

                exchange.getResponseHeaders().set("Content-Type", "text/html");
                exchange.getResponseHeaders().set("Content-Encoding", "gzip");
                exchange.sendResponseHeaders(200, data.length);
                OutputStream os = exchange.getResponseBody();
                os.write(data);
                os.close();
            }
        });

        server.createContext("/deflate", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                DeflaterOutputStream dos = new DeflaterOutputStream(baos);
                dos.write("<html><body>Deflate Content</body></html>".getBytes(StandardCharsets.UTF_8));
                dos.close();
                byte[] data = baos.toByteArray();

                exchange.getResponseHeaders().set("Content-Type", "text/html");
                exchange.getResponseHeaders().set("Content-Encoding", "deflate");
                exchange.sendResponseHeaders(200, data.length);
                OutputStream os = exchange.getResponseBody();
                os.write(data);
                os.close();
            }
        });

        server.start();
    }

    @AfterClass
    public static void tearDownServer() {
        if (server != null) {
            server.stop(0);
        }
    }

    private static byte[] readAll(InputStream in) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int read;
        while ((read = in.read(buffer)) != -1) {
            out.write(buffer, 0, read);
        }
        return out.toByteArray();
    }

    // =========================================================================
    // HttpConnection and KeyVal Factory/Fluent API Tests
    // =========================================================================

    @Test
    public void testConnect_stringUrl_createsConnection() throws Exception {
        Connection con = HttpConnection.connect("http://example.com/test path");
        assertNotNull(con);
        assertEquals(new URL("http://example.com/test%20path"), con.request().url());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConnect_nullString_throwsException() {
        HttpConnection.connect((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConnect_emptyString_throwsException() {
        HttpConnection.connect("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConnect_malformedString_throwsException() {
        HttpConnection.connect("invalid_url_without_protocol");
    }

    @Test
    public void testConnect_urlObject_createsConnection() throws MalformedURLException {
        URL u = new URL("http://example.com/");
        Connection con = HttpConnection.connect(u);
        assertNotNull(con);
        assertEquals(u, con.request().url());
    }

    @Test
    public void testEncodeUrl_withSpaces() throws Exception {
        URL original = new URL("http://example.com/a b?c=d e");
        URL encoded = HttpConnection.encodeUrl(original);
        assertEquals("http://example.com/a%20b?c=d%20e", encoded.toExternalForm());
    }

    @Test
    public void testFluentSetters_andGetters() throws MalformedURLException {
        HttpConnection con = new HttpConnection();
        URL url = new URL("http://example.com");

        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", 8080));
        SSLSocketFactory sslFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
        Parser parser = Parser.xmlParser();

        con.url(url)
           .proxy(proxy)
           .userAgent("TestAgent")
           .timeout(5000)
           .maxBodySize(2048)
           .followRedirects(false)
           .referrer("http://referrer.com")
           .method(Connection.Method.POST)
           .ignoreHttpErrors(true)
           .ignoreContentType(true)
           .sslSocketFactory(sslFactory)
           .requestBody("raw body")
           .postDataCharset("ISO-8859-1")
           .parser(parser);

        Connection.Request req = con.request();
        assertEquals(url, req.url());
        assertEquals(proxy, req.proxy());
        assertEquals("TestAgent", req.header("User-Agent"));
        assertEquals(5000, req.timeout());
        assertEquals(2048, req.maxBodySize());
        assertFalse(req.followRedirects());
        assertEquals("http://referrer.com", req.header("Referer"));
        assertEquals(Connection.Method.POST, req.method());
        assertTrue(req.ignoreHttpErrors());
        assertTrue(req.ignoreContentType());
        assertSame(sslFactory, req.sslSocketFactory());
        assertEquals("raw body", req.requestBody());
        assertEquals("ISO-8859-1", req.postDataCharset());
        assertSame(parser, req.parser());

        con.proxy("localhost", 9090);
        assertNotNull(req.proxy());

        con.url("http://example.com/new-path");
        assertEquals("http://example.com/new-path", con.request().url().toExternalForm());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUserAgent_null_throwsException() {
        new HttpConnection().userAgent(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReferrer_null_throwsException() {
        new HttpConnection().referrer(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTimeout_negative_throwsException() {
        new HttpConnection().timeout(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxBodySize_negative_throwsException() {
        new HttpConnection().maxBodySize(-1);
    }

    @Test(expected = IllegalCharsetNameException.class)
    public void testPostDataCharset_invalid_throwsException() {
        new HttpConnection().postDataCharset("INVALID_CHARSET_NAME_12345");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPostDataCharset_null_throwsException() {
        new HttpConnection().postDataCharset(null);
    }

    // =========================================================================
    // Data & KeyVal Methods Tests
    // =========================================================================

    @Test
    public void testData_variousOverloads() {
        HttpConnection con = new HttpConnection();
        InputStream stream1 = new ByteArrayInputStream("file1".getBytes(StandardCharsets.UTF_8));
        InputStream stream2 = new ByteArrayInputStream("file2".getBytes(StandardCharsets.UTF_8));

        con.data("k1", "v1");
        con.data("k2", "file.txt", stream1);
        con.data("k3", "image.png", stream2, "image/png");

        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("k4", "v4");
        con.data(dataMap);

        con.data("k5", "v5", "k6", "v6");

        List<Connection.KeyVal> list = new ArrayList<>();
        list.add(HttpConnection.KeyVal.create("k7", "v7"));
        con.data(list);

        Collection<Connection.KeyVal> reqData = con.request().data();
        assertEquals(7, reqData.size());

        Connection.KeyVal found = con.data("k1");
        assertNotNull(found);
        assertEquals("v1", found.value());

        Connection.KeyVal fileKeyVal = con.data("k3");
        assertNotNull(fileKeyVal);
        assertEquals("image.png", fileKeyVal.value());
        assertTrue(fileKeyVal.hasInputStream());
        assertEquals("image/png", fileKeyVal.contentType());

        assertNull(con.data("non_existing_key"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testData_mapNull_throwsException() {
        new HttpConnection().data((Map<String, String>) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testData_varargsOddLength_throwsException() {
        new HttpConnection().data("k1", "v1", "k2");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testData_varargsNullArray_throwsException() {
        new HttpConnection().data((String[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testData_varargsEmptyKey_throwsException() {
        new HttpConnection().data("", "v1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testData_varargsNullValue_throwsException() {
        new HttpConnection().data("k1", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testData_collectionNull_throwsException() {
        new HttpConnection().data((Collection<Connection.KeyVal>) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testData_lookupEmptyKey_throwsException() {
        new HttpConnection().data("");
    }

    @Test
    public void testKeyVal_methodsAndValidation() {
        HttpConnection.KeyVal kv = HttpConnection.KeyVal.create("name", "John Doe");
        assertEquals("name", kv.key());
        assertEquals("John Doe", kv.value());
        assertFalse(kv.hasInputStream());
        assertNull(kv.inputStream());
        assertNull(kv.contentType());
        assertEquals("name=John Doe", kv.toString());

        ByteArrayInputStream in = new ByteArrayInputStream(new byte[]{1, 2});
        kv.inputStream(in);
        assertTrue(kv.hasInputStream());
        assertSame(in, kv.inputStream());

        kv.contentType("text/plain");
        assertEquals("text/plain", kv.contentType());

        kv.key("newName").value("newValue");
        assertEquals("newName", kv.key());
        assertEquals("newValue", kv.value());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testKeyVal_emptyKey_throwsException() {
        HttpConnection.KeyVal.create("", "val");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testKeyVal_nullValue_throwsException() {
        HttpConnection.KeyVal.create("key", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testKeyVal_emptyContentType_throwsException() {
        HttpConnection.KeyVal.create("key", "val").contentType("");
    }

    // =========================================================================
    // Headers and Cookies (Base class methods)
    // =========================================================================

    @Test
    public void testHeaders_manipulation() {
        HttpConnection con = new HttpConnection();
        con.header("Accept", "text/html");
        con.header("accept", "application/json"); // overwrite case insensitive

        assertTrue(con.request().hasHeader("ACCEPT"));
        assertTrue(con.request().hasHeaderWithValue("Accept", "application/json"));
        assertFalse(con.request().hasHeaderWithValue("Accept", "text/html"));
        assertEquals("application/json", con.request().header("Accept"));

        con.request().addHeader("Accept", "text/plain");
        List<String> values = con.request().headers("Accept");
        assertEquals(2, values.size());
        assertEquals("application/json, text/plain", con.request().header("Accept"));

        Map<String, String> headersMap = new HashMap<>();
        headersMap.put("X-Test-1", "1");
        headersMap.put("X-Test-2", "2");
        con.headers(headersMap);
        assertTrue(con.request().hasHeader("X-Test-1"));
        assertTrue(con.request().hasHeader("X-Test-2"));

        Map<String, String> flatHeaders = con.request().headers();
        assertEquals("1", flatHeaders.get("X-Test-1"));

        Map<String, List<String>> multiHeaders = con.request().multiHeaders();
        assertTrue(multiHeaders.containsKey("Accept"));

        con.request().removeHeader("accept");
        assertFalse(con.request().hasHeader("Accept"));
        assertNull(con.request().header("Accept"));
        assertTrue(con.request().headers("Accept").isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHeaders_nullMap_throwsException() {
        new HttpConnection().headers(null);
    }

    @Test
    public void testCookies_manipulation() {
        HttpConnection con = new HttpConnection();
        con.cookie("session", "abc");
        assertTrue(con.request().hasCookie("session"));
        assertEquals("abc", con.request().cookie("session"));

        Map<String, String> cookieMap = new HashMap<>();
        cookieMap.put("c1", "v1");
        cookieMap.put("c2", "v2");
        con.cookies(cookieMap);

        assertEquals(3, con.request().cookies().size());

        con.request().removeCookie("session");
        assertFalse(con.request().hasCookie("session"));
        assertNull(con.request().cookie("session"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCookies_nullMap_throwsException() {
        new HttpConnection().cookies(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCookie_emptyName_throwsException() {
        new HttpConnection().cookie("", "val");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCookie_nullValue_throwsException() {
        new HttpConnection().cookie("name", null);
    }

    @Test
    public void testHeaderEncoding_utf8Detection() {
        HttpConnection.Request req = new HttpConnection.Request();

        // Standard ASCII
        req.addHeader("X-Ascii", "plain text");
        assertEquals("plain text", req.header("X-Ascii"));

        // Null header value
        req.addHeader("X-Null", null);
        assertEquals("", req.header("X-Null"));

        // UTF-8 BOM representation in ISO-8859-1
        String bomStr = new String(new byte[]{(byte) 0xEF, (byte) 0xBB, (byte) 0xBF, 'a', 'b'}, StandardCharsets.ISO_8859_1);
        req.addHeader("X-BOM", bomStr);
        assertNotNull(req.header("X-BOM"));

        // 2-byte UTF-8 sequence (Thai character or accented letter)
        String twoByte = new String("สวัสดี".getBytes(StandardCharsets.UTF_8), StandardCharsets.ISO_8859_1);
        req.addHeader("X-Thai", twoByte);
        assertEquals("สวัสดี", req.header("X-Thai"));

        // 4-byte UTF-8 sequence (Emoji)
        String fourByte = new String("😀".getBytes(StandardCharsets.UTF_8), StandardCharsets.ISO_8859_1);
        req.addHeader("X-Emoji", fourByte);
        assertEquals("😀", req.header("X-Emoji"));

        // Invalid UTF-8 sequence (should fallback to original string)
        String invalidUtf8 = new String(new byte[]{(byte) 0xC0, (byte) 0x20}, StandardCharsets.ISO_8859_1);
        req.addHeader("X-Invalid", invalidUtf8);
        assertEquals(invalidUtf8, req.header("X-Invalid"));
    }

    // =========================================================================
    // Request & Response Objects and Execution Tests
    // =========================================================================

    @Test
    public void testRequestResponse_gettersAndSetters() {
        HttpConnection con = new HttpConnection();
        HttpConnection.Request req = new HttpConnection.Request();
        HttpConnection.Response res = new HttpConnection.Response();

        con.request(req);
        con.response(res);
        assertSame(req, con.request());
        assertSame(res, con.response());

        res.charset("UTF-8");
        assertEquals("UTF-8", res.charset());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExecute_nullRequest_throwsException() throws IOException {
        HttpConnection.Response.execute(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExecute_nullUrl_throwsException() throws IOException {
        HttpConnection.Request req = new HttpConnection.Request();
        HttpConnection.Response.execute(req);
    }

    @Test(expected = MalformedURLException.class)
    public void testExecute_unsupportedProtocol_throwsException() throws IOException {
        HttpConnection.Request req = new HttpConnection.Request();
        req.url(new URL("ftp://ftp.example.com"));
        HttpConnection.Response.execute(req);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExecute_getWithRequestBody_throwsException() throws IOException {
        HttpConnection.connect(serverUrl + "/echo")
                .method(Connection.Method.GET)
                .requestBody("body not allowed for GET")
                .execute();
    }

    @Test
    public void testGetAndParse_success() throws IOException {
        Document doc = HttpConnection.connect(serverUrl + "/echo")
                .data("param1", "value 1")
                .get();

        assertNotNull(doc);
        assertTrue(doc.text().contains("echo:"));
    }

    @Test
    public void testPost_formData_success() throws IOException {
        Connection con = HttpConnection.connect(serverUrl + "/echo")
                .data("user", "alice")
                .data("city", "Bangkok");

        Document doc = con.post();
        assertNotNull(doc);
        String body = con.response().body();
        assertTrue(body.contains("user=alice"));
        assertTrue(body.contains("city=Bangkok"));
        assertEquals(200, con.response().statusCode());
        assertEquals("OK", con.response().statusMessage());
        assertTrue(con.response().hasCookie("server_cookie"));
        assertEquals("val123", con.response().cookie("server_cookie"));
        assertEquals("Value1, Value2", con.response().header("Custom-Header"));
    }

    @Test
    public void testPost_requestBody_success() throws IOException {
        Connection con = HttpConnection.connect(serverUrl + "/echo")
                .requestBody("raw-json-data")
                .header("Content-Type", "application/json");

        Connection.Response res = con.method(Connection.Method.POST).execute();
        assertTrue(res.body().contains("raw-json-data"));
    }

    @Test
    public void testPost_multipartData_withInputStream() throws IOException {
        InputStream is = new ByteArrayInputStream("file content".getBytes(StandardCharsets.UTF_8));
        Connection con = HttpConnection.connect(serverUrl + "/echo")
                .data("textKey", "textValue")
                .data("uploadFile", "test.txt", is)
                .method(Connection.Method.POST);

        Connection.Response res = con.execute();
        String body = res.body();
        assertTrue(body.contains("Content-Disposition: form-data; name=\"uploadFile\"; filename=\"test.txt\""));
        assertTrue(body.contains("file content"));
    }

    @Test
    public void testPost_multipartExplicitContentType() throws IOException {
        Connection con = HttpConnection.connect(serverUrl + "/echo")
                .header("Content-Type", "multipart/form-data")
                .data("key", "val")
                .method(Connection.Method.POST);

        Connection.Response res = con.execute();
        assertTrue(res.body().contains("name=\"key\""));
    }

    @Test
    public void testPost_withCookies() throws IOException {
        Connection con = HttpConnection.connect(serverUrl + "/echo")
                .cookie("c1", "v1")
                .cookie("c2", "v2")
                .method(Connection.Method.POST);

        Connection.Response res = con.execute();
        assertEquals(200, res.statusCode());
    }

    @Test
    public void testRedirect_standardAndCookiesPassed() throws IOException {
        Connection con = HttpConnection.connect(serverUrl + "/redirect")
                .followRedirects(true);

        Connection.Response res = con.execute();
        assertEquals(200, res.statusCode());
        assertTrue(res.url().toExternalForm().endsWith("/echo"));
        assertEquals("from_redirect", res.cookie("redir_cookie"));
    }

    @Test
    public void testRedirect_tempRedirect307() throws IOException {
        Connection con = HttpConnection.connect(serverUrl + "/temp-redirect")
                .followRedirects(true);

        Connection.Response res = con.execute();
        assertEquals(200, res.statusCode());
    }

    @Test(expected = IOException.class)
    public void testRedirect_loop_throwsIOException() throws IOException {
        HttpConnection.connect(serverUrl + "/redirect-loop")
                .followRedirects(true)
                .execute();
    }

    @Test(expected = HttpStatusException.class)
    public void testError404_throwsHttpStatusException() throws IOException {
        HttpConnection.connect(serverUrl + "/error-404")
                .ignoreHttpErrors(false)
                .execute();
    }

    @Test
    public void testError404_ignored() throws IOException {
        Connection.Response res = HttpConnection.connect(serverUrl + "/error-404")
                .ignoreHttpErrors(true)
                .execute();
        assertEquals(404, res.statusCode());
        assertTrue(res.body().contains("Not Found"));
    }

    @Test(expected = UnsupportedMimeTypeException.class)
    public void testUnsupportedMimeType_throwsException() throws IOException {
        HttpConnection.connect(serverUrl + "/unsupported-mime")
                .ignoreContentType(false)
                .execute();
    }

    @Test
    public void testUnsupportedMimeType_ignored() throws IOException {
        Connection.Response res = HttpConnection.connect(serverUrl + "/unsupported-mime")
                .ignoreContentType(true)
                .execute();
        assertEquals(200, res.statusCode());
        byte[] bytes = res.bodyAsBytes();
        assertArrayEquals(new byte[]{0x01, 0x02, 0x03}, bytes);
    }

    @Test
    public void testXmlContentType_autoSetsXmlParser() throws IOException {
        Connection con = HttpConnection.connect(serverUrl + "/xml");
        con.execute();
        assertTrue(con.request().parser().getTreeBuilder() instanceof org.jsoup.parser.XmlTreeBuilder);
    }

    @Test
    public void testGzipResponse_decompressesAutomatically() throws IOException {
        Connection.Response res = HttpConnection.connect(serverUrl + "/gzip").execute();
        assertTrue(res.body().contains("Gzip Content"));
    }

    @Test
    public void testDeflateResponse_decompressesAutomatically() throws IOException {
        Connection.Response res = HttpConnection.connect(serverUrl + "/deflate").execute();
        assertTrue(res.body().contains("Deflate Content"));
    }

    @Test
    public void testHeadMethod_hasNoBody() throws IOException {
        Connection.Response res = HttpConnection.connect(serverUrl + "/echo")
                .method(Connection.Method.HEAD)
                .execute();
        assertEquals(200, res.statusCode());
        assertEquals("", res.body());
    }

    @Test
    public void testResponse_bodyAndStreamMethods() throws IOException {
        Connection.Response res = HttpConnection.connect(serverUrl + "/echo")
                .execute();

        res.bufferUp();
        assertNotNull(res.bodyAsBytes());
        assertTrue(res.body().contains("echo:"));
        Document doc = res.parse();
        assertNotNull(doc);
    }

    @Test
    public void testResponse_bodyStream() throws IOException {
        Connection.Response res = HttpConnection.connect(serverUrl + "/echo")
                .execute();

        InputStream stream = res.bodyStream();
        assertNotNull(stream);
        byte[] data = readAll(stream);
        assertTrue(new String(data, StandardCharsets.UTF_8).contains("echo:"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testResponse_unexecutedParse_throwsException() throws IOException {
        HttpConnection.Response res = new HttpConnection.Response();
        res.parse();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testResponse_unexecutedBody_throwsException() {
        HttpConnection.Response res = new HttpConnection.Response();
        res.body();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testResponse_unexecutedBodyStream_throwsException() {
        HttpConnection.Response res = new HttpConnection.Response();
        res.bodyStream();
    }

    @Test
    public void testProcessResponseHeaders_variousEdgeCases() {
        HttpConnection.Response res = new HttpConnection.Response();
        Map<String, List<String>> headers = new LinkedHashMap<>();

        headers.put(null, Collections.singletonList("HTTP/1.1 200 OK")); // status line
        headers.put("Set-Cookie", Arrays.asList("sessionId=xyz; Path=/", "=blankName;", null));
        headers.put("Content-Type", Collections.singletonList("text/html"));

        res.processResponseHeaders(headers);

        assertEquals("xyz", res.cookie("sessionId"));
        assertFalse(res.hasCookie(""));
        assertEquals("text/html", res.header("Content-Type"));
    }
}

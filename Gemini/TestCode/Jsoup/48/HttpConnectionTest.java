package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.IllegalCharsetNameException;
import java.util.*;

public class HttpConnectionTest {

    @Test
    public void testConnect_stringUrl_createsInstance() {
        Connection con = HttpConnection.connect("http://example.com/path with spaces");
        Assert.assertNotNull(con);
        Assert.assertEquals("http://example.com/path%20with%20spaces", con.request().url().toExternalForm());
    }

    @Test
    public void testConnect_urlObject_createsInstance() throws MalformedURLException {
        URL url = new URL("http://example.com/test");
        Connection con = HttpConnection.connect(url);
        Assert.assertNotNull(con);
        Assert.assertEquals(url, con.request().url());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConnect_nullString_throwsException() {
        HttpConnection.connect((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConnect_emptyString_throwsException() {
        HttpConnection.connect("   ");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConnect_malformedString_throwsException() {
        HttpConnection.connect("not_a_valid_url");
    }

    @Test
    public void testUrl_validStringAndUrl_setsUrl() throws MalformedURLException {
        Connection con = HttpConnection.connect("http://example.com");
        con.url("http://example.org/foo bar");
        Assert.assertEquals("http://example.org/foo%20bar", con.request().url().toExternalForm());

        URL newUrl = new URL("http://example.net");
        con.url(newUrl);
        Assert.assertEquals(newUrl, con.request().url());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUrl_nullUrlObject_throwsException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.url((URL) null);
    }

    @Test
    public void testUserAgent_validString_setsHeader() {
        Connection con = HttpConnection.connect("http://example.com");
        con.userAgent("Mozilla/5.0");
        Assert.assertEquals("Mozilla/5.0", con.request().header("User-Agent"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUserAgent_nullString_throwsException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.userAgent(null);
    }

    @Test
    public void testTimeout_validValue_setsTimeout() {
        Connection con = HttpConnection.connect("http://example.com");
        con.timeout(5000);
        Assert.assertEquals(5000, con.request().timeout());
        con.timeout(0);
        Assert.assertEquals(0, con.request().timeout());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTimeout_negativeValue_throwsException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.timeout(-1);
    }

    @Test
    public void testMaxBodySize_validValue_setsMaxBodySize() {
        Connection con = HttpConnection.connect("http://example.com");
        con.maxBodySize(2048);
        Assert.assertEquals(2048, con.request().maxBodySize());
        con.maxBodySize(0);
        Assert.assertEquals(0, con.request().maxBodySize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxBodySize_negativeValue_throwsException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.maxBodySize(-1);
    }

    @Test
    public void testFollowRedirects_booleanValues_setsFollowRedirects() {
        Connection con = HttpConnection.connect("http://example.com");
        con.followRedirects(false);
        Assert.assertFalse(con.request().followRedirects());
        con.followRedirects(true);
        Assert.assertTrue(con.request().followRedirects());
    }

    @Test
    public void testReferrer_validString_setsRefererHeader() {
        Connection con = HttpConnection.connect("http://example.com");
        con.referrer("http://google.com");
        Assert.assertEquals("http://google.com", con.request().header("Referer"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReferrer_nullString_throwsException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.referrer(null);
    }

    @Test
    public void testMethod_validMethod_setsMethod() {
        Connection con = HttpConnection.connect("http://example.com");
        con.method(Connection.Method.POST);
        Assert.assertEquals(Connection.Method.POST, con.request().method());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMethod_nullMethod_throwsException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.method(null);
    }

    @Test
    public void testIgnoreHttpErrors_booleanValues_setsIgnoreHttpErrors() {
        Connection con = HttpConnection.connect("http://example.com");
        con.ignoreHttpErrors(true);
        Assert.assertTrue(con.request().ignoreHttpErrors());
        con.ignoreHttpErrors(false);
        Assert.assertFalse(con.request().ignoreHttpErrors());
    }

    @Test
    public void testIgnoreContentType_booleanValues_setsIgnoreContentType() {
        Connection con = HttpConnection.connect("http://example.com");
        con.ignoreContentType(true);
        Assert.assertTrue(con.request().ignoreContentType());
        con.ignoreContentType(false);
        Assert.assertFalse(con.request().ignoreContentType());
    }

    @Test
    public void testValidateTLSCertificates_booleanValues_setsValidateTLSCertificates() {
        Connection con = HttpConnection.connect("http://example.com");
        con.validateTLSCertificates(false);
        Assert.assertFalse(con.request().validateTLSCertificates());
        con.validateTLSCertificates(true);
        Assert.assertTrue(con.request().validateTLSCertificates());
    }

    @Test
    public void testData_keyAndValue_addsKeyVal() {
        Connection con = HttpConnection.connect("http://example.com");
        con.data("key1", "val1");
        Collection<Connection.KeyVal> data = con.request().data();
        Assert.assertEquals(1, data.size());
        Connection.KeyVal kv = data.iterator().next();
        Assert.assertEquals("key1", kv.key());
        Assert.assertEquals("val1", kv.value());
        Assert.assertFalse(kv.hasInputStream());
    }

    @Test
    public void testData_keyFilenameAndInputStream_addsKeyValWithStream() {
        Connection con = HttpConnection.connect("http://example.com");
        InputStream in = new ByteArrayInputStream("content".getBytes());
        con.data("uploadKey", "file.txt", in);
        Collection<Connection.KeyVal> data = con.request().data();
        Assert.assertEquals(1, data.size());
        Connection.KeyVal kv = data.iterator().next();
        Assert.assertEquals("uploadKey", kv.key());
        Assert.assertEquals("file.txt", kv.value());
        Assert.assertEquals(in, kv.inputStream());
        Assert.assertTrue(kv.hasInputStream());
    }

    @Test
    public void testData_map_addsAllEntries() {
        Connection con = HttpConnection.connect("http://example.com");
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("k1", "v1");
        map.put("k2", "v2");
        con.data(map);
        Collection<Connection.KeyVal> data = con.request().data();
        Assert.assertEquals(2, data.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testData_nullMap_throwsException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.data((Map<String, String>) null);
    }

    @Test
    public void testData_varargs_addsAllPairs() {
        Connection con = HttpConnection.connect("http://example.com");
        con.data("k1", "v1", "k2", "v2");
        Collection<Connection.KeyVal> data = con.request().data();
        Assert.assertEquals(2, data.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testData_nullVarargs_throwsException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.data((String[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testData_oddVarargs_throwsException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.data("k1", "v1", "k2");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testData_varargsWithEmptyKey_throwsException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.data("", "v1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testData_varargsWithNullValue_throwsException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.data("k1", null);
    }

    @Test
    public void testData_collection_addsAll() {
        Connection con = HttpConnection.connect("http://example.com");
        List<Connection.KeyVal> list = new ArrayList<Connection.KeyVal>();
        list.add(HttpConnection.KeyVal.create("k1", "v1"));
        list.add(HttpConnection.KeyVal.create("k2", "v2"));
        con.data(list);
        Assert.assertEquals(2, con.request().data().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testData_nullCollection_throwsException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.data((Collection<Connection.KeyVal>) null);
    }

    @Test
    public void testHeaders_manipulations_caseInsensitive() {
        Connection con = HttpConnection.connect("http://example.com");
        con.header("Content-Type", "application/json");
        Assert.assertTrue(con.request().hasHeader("content-type"));
        Assert.assertTrue(con.request().hasHeader("Content-Type"));
        Assert.assertTrue(con.request().hasHeader("CONTENT-TYPE"));
        Assert.assertEquals("application/json", con.request().header("CONTENT-TYPE"));
        Assert.assertTrue(con.request().hasHeaderWithValue("content-type", "application/json"));
        Assert.assertTrue(con.request().hasHeaderWithValue("CONTENT-TYPE", "APPLICATION/JSON"));
        Assert.assertFalse(con.request().hasHeaderWithValue("content-type", "text/html"));
        Assert.assertFalse(con.request().hasHeaderWithValue("Non-Existent", "val"));

        con.header("content-type", "text/plain");
        Assert.assertEquals("text/plain", con.request().header("Content-Type"));
        Assert.assertEquals(2, con.request().headers().size()); // Accept-Encoding + Content-Type

        con.request().removeHeader("CONTENT-TYPE");
        Assert.assertFalse(con.request().hasHeader("content-type"));
        Assert.assertNull(con.request().header("content-type"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHeader_nullName_throwsException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.header(null, "val");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHeader_emptyName_throwsException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.header("", "val");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHeader_nullValue_throwsException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.header("key", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHasHeader_nullOrEmpty_throwsException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.request().hasHeader("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveHeader_nullOrEmpty_throwsException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.request().removeHeader("");
    }

    @Test
    public void testCookies_manipulations() {
        Connection con = HttpConnection.connect("http://example.com");
        con.cookie("session", "abc");
        Assert.assertTrue(con.request().hasCookie("session"));
        Assert.assertEquals("abc", con.request().cookie("session"));

        Map<String, String> cookies = new LinkedHashMap<String, String>();
        cookies.put("auth", "token123");
        cookies.put("theme", "dark");
        con.cookies(cookies);

        Assert.assertEquals(3, con.request().cookies().size());
        Assert.assertEquals("token123", con.request().cookie("auth"));

        con.request().removeCookie("theme");
        Assert.assertFalse(con.request().hasCookie("theme"));
        Assert.assertNull(con.request().cookie("theme"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCookie_emptyName_throwsException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.cookie("", "val");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCookie_nullValue_throwsException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.cookie("key", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCookies_nullMap_throwsException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.cookies(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHasCookie_emptyName_throwsException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.request().hasCookie("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveCookie_emptyName_throwsException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.request().removeCookie("");
    }

    @Test
    public void testParser_customParser_setsParser() {
        Connection con = HttpConnection.connect("http://example.com");
        Parser xmlParser = Parser.xmlParser();
        con.parser(xmlParser);
        Assert.assertEquals(xmlParser, con.request().parser());
    }

    @Test
    public void testPostDataCharset_validAndInvalid() {
        Connection con = HttpConnection.connect("http://example.com");
        con.postDataCharset("UTF-8");
        Assert.assertEquals("UTF-8", con.request().postDataCharset());
        con.postDataCharset("ISO-8859-1");
        Assert.assertEquals("ISO-8859-1", con.request().postDataCharset());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPostDataCharset_nullCharset_throwsException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.postDataCharset(null);
    }

    @Test(expected = IllegalCharsetNameException.class)
    public void testPostDataCharset_unsupportedCharset_throwsException() {
        Connection con = HttpConnection.connect("http://example.com");
        con.postDataCharset("UNSUPPORTED-CHARSET-12345");
    }

    @Test
    public void testRequestAndResponseGettersSetters() {
        Connection con = HttpConnection.connect("http://example.com");
        Connection.Request req = con.request();
        Connection.Response res = con.response();
        Assert.assertNotNull(req);
        Assert.assertNotNull(res);

        Connection.Request newReq = con.request();
        Connection.Response newRes = con.response();
        con.request(newReq);
        con.response(newRes);
        Assert.assertSame(newReq, con.request());
        Assert.assertSame(newRes, con.response());
    }

    @Test(expected = MalformedURLException.class)
    public void testExecute_unsupportedProtocol_throwsException() throws IOException {
        Connection con = HttpConnection.connect("http://example.com");
        con.request().url(new URL("ftp://ftp.example.com"));
        con.execute();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testResponse_parseBeforeExecute_throwsException() throws IOException {
        Connection.Response res = new HttpConnection.Response();
        res.parse();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testResponse_bodyBeforeExecute_throwsException() {
        Connection.Response res = new HttpConnection.Response();
        res.body();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testResponse_bodyAsBytesBeforeExecute_throwsException() {
        Connection.Response res = new HttpConnection.Response();
        res.bodyAsBytes();
    }

    @Test
    public void testResponse_gettersInitialState() {
        HttpConnection.Response res = new HttpConnection.Response();
        Assert.assertEquals(0, res.statusCode());
        Assert.assertNull(res.statusMessage());
        Assert.assertNull(res.charset());
        Assert.assertNull(res.contentType());
    }

    @Test
    public void testResponse_processResponseHeaders() {
        HttpConnection.Response res = new HttpConnection.Response();
        Map<String, List<String>> headers = new LinkedHashMap<String, List<String>>();
        headers.put(null, Collections.singletonList("HTTP/1.1 200 OK"));
        headers.put("Content-Type", Collections.singletonList("text/html; charset=UTF-8"));
        List<String> cookies = new ArrayList<String>();
        cookies.add("sid=xyz123; Path=/; HttpOnly");
        cookies.add("theme=light;");
        cookies.add("=invalidCookie;");
        cookies.add(null);
        headers.put("Set-Cookie", cookies);
        headers.put("Empty-Header", Collections.<String>emptyList());

        res.processResponseHeaders(headers);

        Assert.assertEquals("text/html; charset=UTF-8", res.header("Content-Type"));
        Assert.assertEquals("xyz123", res.cookie("sid"));
        Assert.assertEquals("light", res.cookie("theme"));
        Assert.assertFalse(res.hasCookie(""));
    }

    @Test
    public void testKeyVal_creationAndSetters() {
        HttpConnection.KeyVal kv = HttpConnection.KeyVal.create("key1", "val1");
        Assert.assertEquals("key1", kv.key());
        Assert.assertEquals("val1", kv.value());
        Assert.assertFalse(kv.hasInputStream());
        Assert.assertNull(kv.inputStream());
        Assert.assertEquals("key1=val1", kv.toString());

        kv.key("newKey").value("newVal");
        Assert.assertEquals("newKey", kv.key());
        Assert.assertEquals("newVal", kv.value());

        InputStream in = new ByteArrayInputStream("data".getBytes());
        HttpConnection.KeyVal kvStream = HttpConnection.KeyVal.create("fileKey", "test.png", in);
        Assert.assertEquals("fileKey", kvStream.key());
        Assert.assertEquals("test.png", kvStream.value());
        Assert.assertEquals(in, kvStream.inputStream());
        Assert.assertTrue(kvStream.hasInputStream());

        InputStream in2 = new ByteArrayInputStream("data2".getBytes());
        kvStream.inputStream(in2);
        Assert.assertEquals(in2, kvStream.inputStream());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testKeyVal_emptyKey_throwsException() {
        HttpConnection.KeyVal.create("", "val");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testKeyVal_nullKey_throwsException() {
        HttpConnection.KeyVal.create(null, "val");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testKeyVal_nullValue_throwsException() {
        HttpConnection.KeyVal.create("key", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testKeyVal_nullInputStreamValue_throwsException() {
        HttpConnection.KeyVal.create("key", null, new ByteArrayInputStream(new byte[0]));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRequest_dataNullKeyval_throwsException() {
        HttpConnection.Request req = (HttpConnection.Request) HttpConnection.connect("http://example.com").request();
        req.data((Connection.KeyVal) null);
    }
}

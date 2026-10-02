import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.parser.Parser;
import org.junit.Test;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class HttpConnectionTest {

    private static final String VALID_URL = "http://example.com/";

    // ---------- connect(String) / connect(URL) ----------

    @Test
    public void testConnectString_validUrl_returnsConnection() {
        Connection con = HttpConnection.connect(VALID_URL);
        assertNotNull(con);
        assertEquals(VALID_URL, con.request().url().toExternalForm());
    }

    @Test
    public void testConnectURL_validUrl_returnsConnection() throws MalformedURLException {
        URL url = new URL(VALID_URL);
        Connection con = HttpConnection.connect(url);
        assertNotNull(con);
        assertEquals(url, con.request().url());
    }

    // ---------- url(String) / url(URL) ----------

    @Test
    public void testUrlString_validUrl_setsUrl() {
        Connection con = new HttpConnection();
        con.url(VALID_URL);
        assertEquals(VALID_URL, con.request().url().toExternalForm());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUrlString_emptyUrl_throwsIllegalArgumentException() {
        Connection con = new HttpConnection();
        con.url("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUrlString_malformedUrl_throwsIllegalArgumentException() {
        Connection con = new HttpConnection();
        con.url("not a valid url");
    }

    @Test
    public void testUrlURL_validUrl_setsUrl() throws MalformedURLException {
        Connection con = new HttpConnection();
        URL url = new URL(VALID_URL);
        con.url(url);
        assertEquals(url, con.request().url());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUrlURL_nullUrl_throwsIllegalArgumentException() {
        Connection con = new HttpConnection();
        con.url((URL) null);
    }

    // ---------- proxy ----------

    @Test
    public void testProxyProxy_setsProxy() {
        Connection con = new HttpConnection();
        Proxy proxy = Proxy.NO_PROXY;
        con.proxy(proxy);
        assertEquals(proxy, con.request().proxy());
    }

    @Test
    public void testProxyHostPort_setsProxy() {
        Connection con = new HttpConnection();
        con.proxy("localhost", 8080);
        assertNotNull(con.request().proxy());
    }

    // ---------- userAgent ----------

    @Test
    public void testUserAgent_validUserAgent_setsHeader() {
        Connection con = new HttpConnection();
        con.userAgent("myagent");
        assertEquals("myagent", con.request().header("User-Agent"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUserAgent_nullUserAgent_throwsIllegalArgumentException() {
        Connection con = new HttpConnection();
        con.userAgent(null);
    }

    // ---------- timeout ----------

    @Test
    public void testTimeout_validValue_setsTimeout() {
        Connection con = new HttpConnection();
        con.timeout(5000);
        assertEquals(5000, con.request().timeout());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTimeout_negativeValue_throwsIllegalArgumentException() {
        Connection con = new HttpConnection();
        con.timeout(-1);
    }

    @Test
    public void testTimeout_zero_isInfiniteAllowed() {
        Connection con = new HttpConnection();
        con.timeout(0);
        assertEquals(0, con.request().timeout());
    }

    // ---------- maxBodySize ----------

    @Test
    public void testMaxBodySize_validValue_setsMaxBodySize() {
        Connection con = new HttpConnection();
        con.maxBodySize(2048);
        assertEquals(2048, con.request().maxBodySize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxBodySize_negativeValue_throwsIllegalArgumentException() {
        Connection con = new HttpConnection();
        con.maxBodySize(-1);
    }

    @Test
    public void testMaxBodySize_zero_isUnlimitedAllowed() {
        Connection con = new HttpConnection();
        con.maxBodySize(0);
        assertEquals(0, con.request().maxBodySize());
    }

    // ---------- followRedirects ----------

    @Test
    public void testFollowRedirects_setsValue() {
        Connection con = new HttpConnection();
        con.followRedirects(false);
        assertFalse(con.request().followRedirects());
        con.followRedirects(true);
        assertTrue(con.request().followRedirects());
    }

    // ---------- referrer ----------

    @Test
    public void testReferrer_validReferrer_setsHeader() {
        Connection con = new HttpConnection();
        con.referrer("http://google.com");
        assertEquals("http://google.com", con.request().header("Referer"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReferrer_nullReferrer_throwsIllegalArgumentException() {
        Connection con = new HttpConnection();
        con.referrer(null);
    }

    // ---------- method ----------

    @Test
    public void testMethod_setsMethod() {
        Connection con = new HttpConnection();
        con.method(Connection.Method.POST);
        assertEquals(Connection.Method.POST, con.request().method());
    }

    // ---------- ignoreHttpErrors ----------

    @Test
    public void testIgnoreHttpErrors_setsValue() {
        Connection con = new HttpConnection();
        con.ignoreHttpErrors(true);
        assertTrue(con.request().ignoreHttpErrors());
    }

    // ---------- ignoreContentType ----------

    @Test
    public void testIgnoreContentType_setsValue() {
        Connection con = new HttpConnection();
        con.ignoreContentType(true);
        assertTrue(con.request().ignoreContentType());
    }

    // ---------- data(key, value) ----------

    @Test
    public void testData_keyValue_addsData() {
        Connection con = new HttpConnection();
        con.data("key1", "value1");
        Connection.KeyVal kv = con.data("key1");
        assertNotNull(kv);
        assertEquals("value1", kv.value());
    }

    // ---------- data(key, filename, inputStream) ----------

    @Test
    public void testData_keyFilenameInputStream_addsData() {
        Connection con = new HttpConnection();
        InputStream is = new ByteArrayInputStream("hello".getBytes());
        con.data("file", "file.txt", is);
        Connection.KeyVal kv = con.data("file");
        assertNotNull(kv);
        assertTrue(kv.hasInputStream());
        assertEquals("file.txt", kv.value());
    }

    // ---------- data(key, filename, inputStream, contentType) ----------

    @Test
    public void testData_keyFilenameInputStreamContentType_addsData() {
        Connection con = new HttpConnection();
        InputStream is = new ByteArrayInputStream("hello".getBytes());
        con.data("file", "file.txt", is, "text/plain");
        Connection.KeyVal kv = con.data("file");
        assertNotNull(kv);
        assertEquals("text/plain", kv.contentType());
    }

    // ---------- data(Map) ----------

    @Test
    public void testData_map_addsData() {
        Connection con = new HttpConnection();
        Map<String, String> data = new HashMap<>();
        data.put("a", "1");
        data.put("b", "2");
        con.data(data);
        assertNotNull(con.data("a"));
        assertNotNull(con.data("b"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testData_mapNull_throwsIllegalArgumentException() {
        Connection con = new HttpConnection();
        con.data((Map<String, String>) null);
    }

    // ---------- data(String...) ----------

    @Test
    public void testData_keyvals_addsData() {
        Connection con = new HttpConnection();
        con.data("k1", "v1", "k2", "v2");
        assertNotNull(con.data("k1"));
        assertNotNull(con.data("k2"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testData_keyvalsOddNumber_throwsIllegalArgumentException() {
        Connection con = new HttpConnection();
        con.data("k1", "v1", "k2");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testData_keyvalsEmptyKey_throwsIllegalArgumentException() {
        Connection con = new HttpConnection();
        con.data("", "v1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testData_keyvalsNull_throwsIllegalArgumentException() {
        Connection con = new HttpConnection();
        con.data((String[]) null);
    }

    // ---------- data(Collection) ----------

    @Test
    public void testData_collection_addsData() {
        Connection con = new HttpConnection();
        Collection<Connection.KeyVal> keyVals = new ArrayList<>();
        keyVals.add(HttpConnection.KeyVal.create("ck", "cv"));
        con.data(keyVals);
        assertNotNull(con.data("ck"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testData_collectionNull_throwsIllegalArgumentException() {
        Connection con = new HttpConnection();
        con.data((Collection<Connection.KeyVal>) null);
    }

    // ---------- data(key) ----------

    @Test
    public void testData_getByKey_notFound_returnsNull() {
        Connection con = new HttpConnection();
        assertNull(con.data("nonexistent"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testData_getByKeyEmpty_throwsIllegalArgumentException() {
        Connection con = new HttpConnection();
        con.data("");
    }

    // ---------- requestBody ----------

    @Test
    public void testRequestBody_setsBody() {
        Connection con = new HttpConnection();
        con.requestBody("hello world");
        assertEquals("hello world", con.request().requestBody());
    }

    // ---------- header ----------

    @Test
    public void testHeader_setsHeader() {
        Connection con = new HttpConnection();
        con.header("X-Test", "testval");
        assertEquals("testval", con.request().header("X-Test"));
    }

    // ---------- headers(Map) ----------

    @Test
    public void testHeaders_map_setsHeaders() {
        Connection con = new HttpConnection();
        Map<String, String> headers = new HashMap<>();
        headers.put("X-One", "1");
        headers.put("X-Two", "2");
        con.headers(headers);
        assertEquals("1", con.request().header("X-One"));
        assertEquals("2", con.request().header("X-Two"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHeaders_mapNull_throwsIllegalArgumentException() {
        Connection con = new HttpConnection();
        con.headers(null);
    }

    // ---------- cookie ----------

    @Test
    public void testCookie_setsCookie() {
        Connection con = new HttpConnection();
        con.cookie("name", "value");
        assertEquals("value", con.request().cookie("name"));
    }

    // ---------- cookies(Map) ----------

    @Test
    public void testCookies_map_setsCookies() {
        Connection con = new HttpConnection();
        Map<String, String> cookies = new HashMap<>();
        cookies.put("c1", "v1");
        con.cookies(cookies);
        assertEquals("v1", con.request().cookie("c1"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCookies_mapNull_throwsIllegalArgumentException() {
        Connection con = new HttpConnection();
        con.cookies(null);
    }

    // ---------- parser ----------

    @Test
    public void testParser_setsParser() {
        Connection con = new HttpConnection();
        Parser parser = Parser.xmlParser();
        con.parser(parser);
        assertEquals(parser, con.request().parser());
    }

    // ---------- sslSocketFactory ----------

    @Test
    public void testSslSocketFactory_setsFactory() {
        Connection con = new HttpConnection();
        SSLSocketFactory factory = HttpsURLConnection.getDefaultSSLSocketFactory();
        con.sslSocketFactory(factory);
        assertEquals(factory, ((HttpConnection.Request) con.request()).sslSocketFactory());
    }

    // ---------- request / response getters/setters ----------

    @Test
    public void testRequest_getter_returnsRequest() {
        Connection con = new HttpConnection();
        assertNotNull(con.request());
    }

    @Test
    public void testRequest_setter_setsRequest() {
        Connection con = new HttpConnection();
        Connection.Request newReq = new HttpConnection.Request();
        con.request(newReq);
        assertEquals(newReq, con.request());
    }

    @Test
    public void testResponse_getter_returnsResponse() {
        Connection con = new HttpConnection();
        assertNotNull(con.response());
    }

    @Test
    public void testResponse_setter_setsResponse() {
        Connection con = new HttpConnection();
        HttpConnection.Response newRes = new HttpConnection.Response();
        con.response(newRes);
        assertEquals(newRes, con.response());
    }

    // ---------- postDataCharset ----------

    @Test
    public void testPostDataCharset_validCharset_setsCharset() {
        Connection con = new HttpConnection();
        con.postDataCharset("UTF-8");
        assertEquals("UTF-8", con.request().postDataCharset());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPostDataCharset_nullCharset_throwsIllegalArgumentException() {
        Connection con = new HttpConnection();
        con.postDataCharset(null);
    }

    @Test(expected = IllegalCharsetNameException.class)
    public void testPostDataCharset_invalidCharset_throwsIllegalCharsetNameException() {
        Connection con = new HttpConnection();
        con.postDataCharset("not-a-real-charset-!!!");
    }

    // ---------- execute / get / post (no network, invalid protocol path) ----------

    @Test(expected = MalformedURLException.class)
    public void testExecute_invalidProtocol_throwsMalformedURLException() throws IOException {
        Connection con = new HttpConnection();
        con.url("ftp://example.com/file");
        con.execute();
    }

    @Test(expected = MalformedURLException.class)
    public void testGet_invalidProtocol_throwsMalformedURLException() throws IOException {
        Connection con = new HttpConnection();
        con.url("ftp://example.com/file");
        con.get();
    }

    @Test(expected = MalformedURLException.class)
    public void testPost_invalidProtocol_throwsMalformedURLException() throws IOException {
        Connection con = new HttpConnection();
        con.url("ftp://example.com/file");
        con.post();
    }

    // ---------- Request class direct tests ----------

    @Test
    public void testRequest_defaults() {
        HttpConnection.Request req = new HttpConnection.Request();
        assertEquals(30000, req.timeout());
        assertEquals(1024 * 1024, req.maxBodySize());
        assertTrue(req.followRedirects());
        assertFalse(req.ignoreHttpErrors());
        assertFalse(req.ignoreContentType());
        assertEquals(Connection.Method.GET, req.method());
        assertNotNull(req.parser());
    }

    @Test
    public void testRequest_proxyHostPort_setsProxy() {
        HttpConnection.Request req = new HttpConnection.Request();
        req.proxy("localhost", 1234);
        assertNotNull(req.proxy());
    }

    @Test
    public void testRequest_data_addsAndRetrieves() {
        HttpConnection.Request req = new HttpConnection.Request();
        Connection.KeyVal kv = HttpConnection.KeyVal.create("k", "v");
        req.data(kv);
        assertTrue(req.data().contains(kv));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRequest_dataNull_throwsIllegalArgumentException() {
        HttpConnection.Request req = new HttpConnection.Request();
        req.data(null);
    }

    // ---------- Base (via Request) header/cookie tests ----------

    @Test
    public void testHeader_caseInsensitive() {
        HttpConnection.Request req = new HttpConnection.Request();
        req.header("X-Custom", "value1");
        assertEquals("value1", req.header("x-custom"));
    }

    @Test
    public void testAddHeader_multipleValues_joinsWithComma() {
        HttpConnection.Request req = new HttpConnection.Request();
        req.addHeader("X-Multi", "a");
        req.addHeader("X-Multi", "b");
        assertEquals("a, b", req.header("X-Multi"));
    }

    @Test
    public void testHasHeader_returnsTrueWhenPresent() {
        HttpConnection.Request req = new HttpConnection.Request();
        req.header("X-Present", "yes");
        assertTrue(req.hasHeader("X-Present"));
        assertFalse(req.hasHeader("X-Absent"));
    }

    @Test
    public void testHasHeaderWithValue_matchesCaseInsensitive() {
        HttpConnection.Request req = new HttpConnection.Request();
        req.header("X-Val", "SomeValue");
        assertTrue(req.hasHeaderWithValue("X-Val", "somevalue"));
        assertFalse(req.hasHeaderWithValue("X-Val", "other"));
    }

    @Test
    public void testRemoveHeader_removesHeader() {
        HttpConnection.Request req = new HttpConnection.Request();
        req.header("X-Remove", "val");
        assertTrue(req.hasHeader("X-Remove"));
        req.removeHeader("X-Remove");
        assertFalse(req.hasHeader("X-Remove"));
    }

    @Test
    public void testHeadersMap_returnsFirstValuePerHeader() {
        HttpConnection.Request req = new HttpConnection.Request();
        req.addHeader("X-Map", "first");
        req.addHeader("X-Map", "second");
        Map<String, String> map = req.headers();
        assertEquals("first", map.get("X-Map"));
    }

    @Test
    public void testMultiHeaders_returnsAllValues() {
        HttpConnection.Request req = new HttpConnection.Request();
        req.addHeader("X-Multi2", "v1");
        req.addHeader("X-Multi2", "v2");
        Map<String, List<String>> multi = req.multiHeaders();
        assertTrue(multi.containsKey("X-Multi2"));
        assertEquals(2, multi.get("X-Multi2").size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHeader_emptyName_throwsIllegalArgumentException() {
        HttpConnection.Request req = new HttpConnection.Request();
        req.header("", "value");
    }

    @Test
    public void testCookieGetter_returnsCookieValue() {
        HttpConnection.Request req = new HttpConnection.Request();
        req.cookie("c", "v");
        assertEquals("v", req.cookie("c"));
    }

    @Test
    public void testHasCookie_returnsTrueWhenPresent() {
        HttpConnection.Request req = new HttpConnection.Request();
        req.cookie("hc", "val");
        assertTrue(req.hasCookie("hc"));
        assertFalse(req.hasCookie("notpresent"));
    }

    @Test
    public void testRemoveCookie_removesCookie() {
        HttpConnection.Request req = new HttpConnection.Request();
        req.cookie("rc", "val");
        req.removeCookie("rc");
        assertFalse(req.hasCookie("rc"));
    }

    @Test
    public void testCookiesGetter_returnsCookieMap() {
        HttpConnection.Request req = new HttpConnection.Request();
        req.cookie("c1", "v1");
        Map<String, String> cookies = req.cookies();
        assertEquals("v1", cookies.get("c1"));
    }

    @Test
    public void testUrlGetter_returnsUrl() throws MalformedURLException {
        HttpConnection.Request req = new HttpConnection.Request();
        URL url = new URL(VALID_URL);
        req.url(url);
        assertEquals(url, req.url());
    }

    @Test
    public void testMethodGetter_returnsMethod() {
        HttpConnection.Request req = new HttpConnection.Request();
        req.method(Connection.Method.PUT);
        assertEquals(Connection.Method.PUT, req.method());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMethod_null_throwsIllegalArgumentException() {
        HttpConnection.Request req = new HttpConnection.Request();
        req.method(null);
    }

    // ---------- KeyVal tests ----------

    @Test
    public void testKeyVal_create_setsKeyAndValue() {
        Connection.KeyVal kv = HttpConnection.KeyVal.create("key", "value");
        assertEquals("key", kv.key());
        assertEquals("value", kv.value());
        assertFalse(kv.hasInputStream());
    }

    @Test
    public void testKeyVal_createWithStream_setsStream() {
        InputStream is = new ByteArrayInputStream("data".getBytes());
        Connection.KeyVal kv = HttpConnection.KeyVal.create("k", "file.txt", is);
        assertTrue(kv.hasInputStream());
        assertEquals(is, kv.inputStream());
    }

    @Test
    public void testKeyVal_contentType_setsAndGets() {
        Connection.KeyVal kv = HttpConnection.KeyVal.create("k", "v");
        kv.contentType("text/plain");
        assertEquals("text/plain", kv.contentType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testKeyVal_contentTypeEmpty_throwsIllegalArgumentException() {
        Connection.KeyVal kv = HttpConnection.KeyVal.create("k", "v");
        kv.contentType("");
    }

    @Test
    public void testKeyVal_toString_returnsKeyEqualsValue() {
        Connection.KeyVal kv = HttpConnection.KeyVal.create("key", "value");
        assertEquals("key=value", kv.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testKeyVal_keyEmpty_throwsIllegalArgumentException() {
        HttpConnection.KeyVal.create("", "value");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testKeyVal_valueNull_throwsIllegalArgumentException() {
        HttpConnection.KeyVal.create("key", null);
    }

    // ---------- Response tests (no network) ----------

    @Test(expected = IllegalArgumentException.class)
    public void testResponseParse_notExecuted_throwsIllegalArgumentException() throws IOException {
        HttpConnection.Response res = new HttpConnection.Response();
        res.parse();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testResponseBody_notExecuted_throwsIllegalArgumentException() {
        HttpConnection.Response res = new HttpConnection.Response();
        res.body();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testResponseBodyStream_notExecuted_throwsIllegalArgumentException() {
        HttpConnection.Response res = new HttpConnection.Response();
        res.bodyStream();
    }

    @Test
    public void testResponse_statusCodeDefault_isZero() {
        HttpConnection.Response res = new HttpConnection.Response();
        assertEquals(0, res.statusCode());
    }

    @Test
    public void testResponse_statusMessageDefault_isNull() {
        HttpConnection.Response res = new HttpConnection.Response();
        assertNull(res.statusMessage());
    }

    @Test
    public void testResponse_charsetSetterGetter() {
        HttpConnection.Response res = new HttpConnection.Response();
        res.charset("UTF-8");
        assertEquals("UTF-8", res.charset());
    }

    @Test
    public void testResponse_contentTypeDefault_isNull() {
        HttpConnection.Response res = new HttpConnection.Response();
        assertNull(res.contentType());
    }
}

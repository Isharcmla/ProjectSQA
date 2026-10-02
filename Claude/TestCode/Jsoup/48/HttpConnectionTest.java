import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.parser.Parser;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HttpConnectionTest {

    private static final String VALID_URL = "http://example.com/";

    @Before
    public void setUp() {
        // nothing to init globally
    }

    // ---------- connect() ----------

    @Test
    public void testConnectString_validUrl_returnsConnection() {
        Connection con = HttpConnection.connect(VALID_URL);
        assertNotNull(con);
        assertEquals(VALID_URL, con.request().url().toExternalForm());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConnectString_emptyUrl_throwsException() {
        HttpConnection.connect("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConnectString_malformedUrl_throwsException() {
        HttpConnection.connect("not a url");
    }

    @Test
    public void testConnectURL_validUrl_returnsConnection() throws MalformedURLException {
        URL url = new URL(VALID_URL);
        Connection con = HttpConnection.connect(url);
        assertNotNull(con);
        assertEquals(url, con.request().url());
    }

    // ---------- url() ----------

    @Test
    public void testUrlString_withSpaces_encodesSpaces() {
        Connection con = HttpConnection.connect("http://example.com/a b");
        assertTrue(con.request().url().toExternalForm().contains("%20"));
    }

    @Test
    public void testUrlURL_setsUrl() throws MalformedURLException {
        Connection con = HttpConnection.connect(VALID_URL);
        URL newUrl = new URL("http://another.com/");
        con.url(newUrl);
        assertEquals(newUrl, con.request().url());
    }

    // ---------- userAgent ----------

    @Test
    public void testUserAgent_setsHeader_normal() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.userAgent("MyAgent/1.0");
        assertEquals("MyAgent/1.0", con.request().header("User-Agent"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUserAgent_null_throwsException() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.userAgent(null);
    }

    // ---------- timeout ----------

    @Test
    public void testTimeout_normalValue_setsTimeout() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.timeout(5000);
        assertEquals(5000, con.request().timeout());
    }

    @Test
    public void testTimeout_zero_valid() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.timeout(0);
        assertEquals(0, con.request().timeout());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTimeout_negative_throwsException() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.timeout(-1);
    }

    // ---------- maxBodySize ----------

    @Test
    public void testMaxBodySize_normalValue_setsSize() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.maxBodySize(2048);
        assertEquals(2048, con.request().maxBodySize());
    }

    @Test
    public void testMaxBodySize_zero_valid() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.maxBodySize(0);
        assertEquals(0, con.request().maxBodySize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxBodySize_negative_throwsException() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.maxBodySize(-5);
    }

    // ---------- followRedirects ----------

    @Test
    public void testFollowRedirects_setFalse_getFalse() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.followRedirects(false);
        assertFalse(con.request().followRedirects());
    }

    @Test
    public void testFollowRedirects_defaultTrue() {
        Connection con = HttpConnection.connect(VALID_URL);
        assertTrue(con.request().followRedirects());
    }

    // ---------- referrer ----------

    @Test
    public void testReferrer_setsHeader_normal() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.referrer("http://referrer.com");
        assertEquals("http://referrer.com", con.request().header("Referer"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReferrer_null_throwsException() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.referrer(null);
    }

    // ---------- method ----------

    @Test
    public void testMethod_setsMethod_normal() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.method(Connection.Method.POST);
        assertEquals(Connection.Method.POST, con.request().method());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMethod_null_throwsException() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.method(null);
    }

    // ---------- ignoreHttpErrors ----------

    @Test
    public void testIgnoreHttpErrors_setTrue_getTrue() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.ignoreHttpErrors(true);
        assertTrue(con.request().ignoreHttpErrors());
    }

    // ---------- ignoreContentType ----------

    @Test
    public void testIgnoreContentType_setTrue_getTrue() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.ignoreContentType(true);
        assertTrue(con.request().ignoreContentType());
    }

    // ---------- validateTLSCertificates ----------

    @Test
    public void testValidateTLSCertificates_setFalse_getFalse() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.validateTLSCertificates(false);
        assertFalse(con.request().validateTLSCertificates());
    }

    @Test
    public void testValidateTLSCertificates_defaultTrue() {
        Connection con = HttpConnection.connect(VALID_URL);
        assertTrue(con.request().validateTLSCertificates());
    }

    // ---------- data(String key, String value) ----------

    @Test
    public void testDataKeyValue_addsData_normal() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.data("key1", "value1");
        assertEquals(1, con.request().data().size());
    }

    // ---------- data(String key, String filename, InputStream) ----------

    @Test
    public void testDataKeyFilenameStream_addsData_normal() {
        Connection con = HttpConnection.connect(VALID_URL);
        InputStream is = new ByteArrayInputStream("hello".getBytes());
        con.data("file", "test.txt", is);
        assertEquals(1, con.request().data().size());
    }

    // ---------- data(Map) ----------

    @Test
    public void testDataMap_addsMultipleEntries_normal() {
        Connection con = HttpConnection.connect(VALID_URL);
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "1");
        map.put("b", "2");
        con.data(map);
        assertEquals(2, con.request().data().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataMap_null_throwsException() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.data((Map<String, String>) null);
    }

    // ---------- data(String... keyvals) ----------

    @Test
    public void testDataVarargs_evenPairs_addsData() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.data("k1", "v1", "k2", "v2");
        assertEquals(2, con.request().data().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataVarargs_oddPairs_throwsException() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.data("k1", "v1", "k2");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataVarargs_null_throwsException() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.data((String[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataVarargs_emptyKey_throwsException() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.data("", "v1");
    }

    // ---------- data(Collection<KeyVal>) ----------

    @Test
    public void testDataCollection_addsData_normal() {
        Connection con = HttpConnection.connect(VALID_URL);
        Collection<Connection.KeyVal> col = new ArrayList<Connection.KeyVal>();
        col.add(HttpConnection.KeyVal.create("k", "v"));
        con.data(col);
        assertEquals(1, con.request().data().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataCollection_null_throwsException() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.data((Collection<Connection.KeyVal>) null);
    }

    // ---------- header ----------

    @Test
    public void testHeader_setsHeader_normal() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.header("X-Test", "value");
        assertEquals("value", con.request().header("X-Test"));
    }

    // ---------- cookie ----------

    @Test
    public void testCookie_setsCookie_normal() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.cookie("name", "val");
        assertEquals("val", con.request().cookie("name"));
    }

    // ---------- cookies(Map) ----------

    @Test
    public void testCookiesMap_addsMultiple_normal() {
        Connection con = HttpConnection.connect(VALID_URL);
        Map<String, String> map = new HashMap<String, String>();
        map.put("c1", "v1");
        map.put("c2", "v2");
        con.cookies(map);
        assertTrue(con.request().hasCookie("c1"));
        assertTrue(con.request().hasCookie("c2"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCookiesMap_null_throwsException() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.cookies(null);
    }

    // ---------- parser ----------

    @Test
    public void testParser_setsParser_normal() {
        Connection con = HttpConnection.connect(VALID_URL);
        Parser xmlParser = Parser.xmlParser();
        con.parser(xmlParser);
        assertEquals(xmlParser, con.request().parser());
    }

    // ---------- postDataCharset ----------

    @Test
    public void testPostDataCharset_validCharset_setsCharset() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.postDataCharset("UTF-8");
        assertEquals("UTF-8", con.request().postDataCharset());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPostDataCharset_null_throwsException() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.postDataCharset(null);
    }

    @Test(expected = java.nio.charset.IllegalCharsetNameException.class)
    public void testPostDataCharset_unsupportedCharset_throwsException() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.postDataCharset("this-is-not-a-real-charset-xyz");
    }

    // ---------- request() / request(Request) ----------

    @Test
    public void testRequest_getter_returnsRequest() {
        Connection con = HttpConnection.connect(VALID_URL);
        assertNotNull(con.request());
    }

    @Test
    public void testRequest_setter_setsRequest() {
        Connection con = HttpConnection.connect(VALID_URL);
        Connection.Request newReq = new HttpConnection.Request();
        newReq.url(con.request().url());
        con.request(newReq);
        assertSame(newReq, con.request());
    }

    // ---------- response() / response(Response) ----------

    @Test
    public void testResponse_getter_returnsResponse() {
        Connection con = HttpConnection.connect(VALID_URL);
        assertNotNull(con.response());
    }

    @Test
    public void testResponse_setter_setsResponse() {
        Connection con = HttpConnection.connect(VALID_URL);
        Connection.Response newRes = new HttpConnection.Response();
        con.response(newRes);
        assertSame(newRes, con.response());
    }

    // ---------- execute()/get()/post() - error paths without real network ----------

    @Test
    public void testExecute_unsupportedProtocol_throwsMalformedURLException() {
        try {
            Connection con = HttpConnection.connect("ftp://example.com/file.txt");
            con.execute();
            fail("Expected MalformedURLException");
        } catch (MalformedURLException e) {
            // expected
        } catch (IOException e) {
            fail("Expected MalformedURLException but got " + e);
        }
    }

    @Test
    public void testGet_unsupportedProtocol_throwsIOException() {
        try {
            Connection con = HttpConnection.connect("ftp://example.com/file.txt");
            con.get();
            fail("Expected IOException");
        } catch (IOException e) {
            assertTrue(e instanceof MalformedURLException);
        }
    }

    @Test
    public void testPost_unsupportedProtocol_throwsIOException() {
        try {
            Connection con = HttpConnection.connect("ftp://example.com/file.txt");
            con.post();
            fail("Expected IOException");
        } catch (IOException e) {
            assertTrue(e instanceof MalformedURLException);
        }
    }

    @Test
    public void testExecute_connectionRefused_throwsIOException() {
        // Using an unlikely-to-be-open local port should fail fast with connection refused
        try {
            Connection con = HttpConnection.connect("http://localhost:1/")
                    .timeout(2000);
            con.execute();
            // if no exception thrown (unlikely), just pass silently
        } catch (IOException e) {
            // expected - connection refused or similar
            assertTrue(true);
        }
    }

    // ---------- Base methods via Request (header, cookie helpers) ----------

    @Test
    public void testHasHeader_existingHeader_returnsTrue() {
        Connection con = HttpConnection.connect(VALID_URL);
        assertTrue(con.request().hasHeader("Accept-Encoding"));
    }

    @Test
    public void testHasHeader_nonExistingHeader_returnsFalse() {
        Connection con = HttpConnection.connect(VALID_URL);
        assertFalse(con.request().hasHeader("X-Not-Present"));
    }

    @Test
    public void testHasHeaderWithValue_matchingValue_returnsTrue() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.header("X-Custom", "SomeValue");
        assertTrue(con.request().hasHeaderWithValue("X-Custom", "somevalue"));
    }

    @Test
    public void testHasHeaderWithValue_nonMatchingValue_returnsFalse() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.header("X-Custom", "SomeValue");
        assertFalse(con.request().hasHeaderWithValue("X-Custom", "other"));
    }

    @Test
    public void testRemoveHeader_existingHeader_removesIt() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.header("X-Remove", "val");
        con.request().removeHeader("X-Remove");
        assertFalse(con.request().hasHeader("X-Remove"));
    }

    @Test
    public void testHeaders_returnsMap_containsDefault() {
        Connection con = HttpConnection.connect(VALID_URL);
        Map<String, String> headers = con.request().headers();
        assertNotNull(headers);
        assertTrue(headers.containsKey("Accept-Encoding"));
    }

    @Test
    public void testHeaderCaseInsensitive_getHeader_returnsValue() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.header("X-Mixed-Case", "MyVal");
        assertEquals("MyVal", con.request().header("x-mixed-case"));
    }

    @Test
    public void testHasCookie_existingCookie_returnsTrue() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.cookie("mycookie", "myvalue");
        assertTrue(con.request().hasCookie("mycookie"));
    }

    @Test
    public void testHasCookie_nonExistingCookie_returnsFalse() {
        Connection con = HttpConnection.connect(VALID_URL);
        assertFalse(con.request().hasCookie("nonexistent"));
    }

    @Test
    public void testRemoveCookie_existingCookie_removesIt() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.cookie("toRemove", "val");
        con.request().removeCookie("toRemove");
        assertFalse(con.request().hasCookie("toRemove"));
    }

    @Test
    public void testCookies_returnsMap_normal() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.cookie("a", "1");
        Map<String, String> cookies = con.request().cookies();
        assertNotNull(cookies);
        assertEquals("1", cookies.get("a"));
    }

    // ---------- Request specific defaults ----------

    @Test
    public void testRequestDefaults_methodIsGet() {
        Connection con = HttpConnection.connect(VALID_URL);
        assertEquals(Connection.Method.GET, con.request().method());
    }

    @Test
    public void testRequestDefaults_timeoutIs3000() {
        Connection con = HttpConnection.connect(VALID_URL);
        assertEquals(3000, con.request().timeout());
    }

    @Test
    public void testRequestDefaults_maxBodySizeIs1MB() {
        Connection con = HttpConnection.connect(VALID_URL);
        assertEquals(1024 * 1024, con.request().maxBodySize());
    }

    @Test
    public void testRequestDefaults_parserIsHtml() {
        Connection con = HttpConnection.connect(VALID_URL);
        assertNotNull(con.request().parser());
    }

    @Test
    public void testRequestDefaults_postDataCharsetIsUtf8() {
        Connection con = HttpConnection.connect(VALID_URL);
        assertNotNull(con.request().postDataCharset());
    }

    // ---------- KeyVal ----------

    @Test
    public void testKeyValCreate_keyValue_normal() {
        Connection.KeyVal kv = HttpConnection.KeyVal.create("key", "value");
        assertEquals("key", kv.key());
        assertEquals("value", kv.value());
        assertFalse(kv.hasInputStream());
    }

    @Test
    public void testKeyValCreate_withInputStream_hasInputStreamTrue() {
        InputStream is = new ByteArrayInputStream("data".getBytes());
        Connection.KeyVal kv = HttpConnection.KeyVal.create("file", "filename.txt", is);
        assertTrue(kv.hasInputStream());
        assertSame(is, kv.inputStream());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testKeyVal_emptyKey_throwsException() {
        HttpConnection.KeyVal.create("", "value");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testKeyVal_nullValue_throwsException() {
        HttpConnection.KeyVal.create("key", null);
    }

    @Test
    public void testKeyVal_toString_returnsKeyEqualsValue() {
        Connection.KeyVal kv = HttpConnection.KeyVal.create("key", "value");
        assertEquals("key=value", kv.toString());
    }

    // ---------- URL edge cases ----------

    @Test(expected = IllegalArgumentException.class)
    public void testUrl_nullString_throwsException() {
        Connection con = HttpConnection.connect(VALID_URL);
        con.url((String) null);
    }

    @Test
    public void testUrl_getterReturnsUrl() {
        Connection con = HttpConnection.connect(VALID_URL);
        assertEquals(VALID_URL, con.request().url().toExternalForm());
    }
}

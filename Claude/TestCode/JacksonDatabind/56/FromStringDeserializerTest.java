import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.JsonNode;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class FromStringDeserializerTest {

    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    // ---------- types() ----------

    @Test
    public void testTypes_returnsExpectedClasses_containsAllTypes() {
        Class<?>[] types = FromStringDeserializer.types();
        assertNotNull(types);
        assertEquals(12, types.length);

        boolean hasFile = false, hasUrl = false, hasUri = false, hasClass = false,
                hasJavaType = false, hasCurrency = false, hasPattern = false,
                hasLocale = false, hasCharset = false, hasTimeZone = false,
                hasInetAddress = false, hasInetSocketAddress = false;

        for (Class<?> c : types) {
            if (c == File.class) hasFile = true;
            else if (c == URL.class) hasUrl = true;
            else if (c == URI.class) hasUri = true;
            else if (c == Class.class) hasClass = true;
            else if (c == JavaType.class) hasJavaType = true;
            else if (c == Currency.class) hasCurrency = true;
            else if (c == Pattern.class) hasPattern = true;
            else if (c == Locale.class) hasLocale = true;
            else if (c == Charset.class) hasCharset = true;
            else if (c == TimeZone.class) hasTimeZone = true;
            else if (c == InetAddress.class) hasInetAddress = true;
            else if (c == InetSocketAddress.class) hasInetSocketAddress = true;
        }

        assertTrue(hasFile);
        assertTrue(hasUrl);
        assertTrue(hasUri);
        assertTrue(hasClass);
        assertTrue(hasJavaType);
        assertTrue(hasCurrency);
        assertTrue(hasPattern);
        assertTrue(hasLocale);
        assertTrue(hasCharset);
        assertTrue(hasTimeZone);
        assertTrue(hasInetAddress);
        assertTrue(hasInetSocketAddress);
    }

    // ---------- findDeserializer() ----------

    @Test
    public void testFindDeserializer_fileType_returnsStdWithFileKind() {
        FromStringDeserializer.Std std = FromStringDeserializer.findDeserializer(File.class);
        assertNotNull(std);
        assertEquals(FromStringDeserializer.Std.STD_FILE, std._kind);
    }

    @Test
    public void testFindDeserializer_urlType_returnsStdWithUrlKind() {
        FromStringDeserializer.Std std = FromStringDeserializer.findDeserializer(URL.class);
        assertNotNull(std);
        assertEquals(FromStringDeserializer.Std.STD_URL, std._kind);
    }

    @Test
    public void testFindDeserializer_uriType_returnsStdWithUriKind() {
        FromStringDeserializer.Std std = FromStringDeserializer.findDeserializer(URI.class);
        assertNotNull(std);
        assertEquals(FromStringDeserializer.Std.STD_URI, std._kind);
    }

    @Test
    public void testFindDeserializer_classType_returnsStdWithClassKind() {
        FromStringDeserializer.Std std = FromStringDeserializer.findDeserializer(Class.class);
        assertNotNull(std);
        assertEquals(FromStringDeserializer.Std.STD_CLASS, std._kind);
    }

    @Test
    public void testFindDeserializer_javaTypeType_returnsStdWithJavaTypeKind() {
        FromStringDeserializer.Std std = FromStringDeserializer.findDeserializer(JavaType.class);
        assertNotNull(std);
        assertEquals(FromStringDeserializer.Std.STD_JAVA_TYPE, std._kind);
    }

    @Test
    public void testFindDeserializer_currencyType_returnsStdWithCurrencyKind() {
        FromStringDeserializer.Std std = FromStringDeserializer.findDeserializer(Currency.class);
        assertNotNull(std);
        assertEquals(FromStringDeserializer.Std.STD_CURRENCY, std._kind);
    }

    @Test
    public void testFindDeserializer_patternType_returnsStdWithPatternKind() {
        FromStringDeserializer.Std std = FromStringDeserializer.findDeserializer(Pattern.class);
        assertNotNull(std);
        assertEquals(FromStringDeserializer.Std.STD_PATTERN, std._kind);
    }

    @Test
    public void testFindDeserializer_localeType_returnsStdWithLocaleKind() {
        FromStringDeserializer.Std std = FromStringDeserializer.findDeserializer(Locale.class);
        assertNotNull(std);
        assertEquals(FromStringDeserializer.Std.STD_LOCALE, std._kind);
    }

    @Test
    public void testFindDeserializer_charsetType_returnsStdWithCharsetKind() {
        FromStringDeserializer.Std std = FromStringDeserializer.findDeserializer(Charset.class);
        assertNotNull(std);
        assertEquals(FromStringDeserializer.Std.STD_CHARSET, std._kind);
    }

    @Test
    public void testFindDeserializer_timeZoneType_returnsStdWithTimeZoneKind() {
        FromStringDeserializer.Std std = FromStringDeserializer.findDeserializer(TimeZone.class);
        assertNotNull(std);
        assertEquals(FromStringDeserializer.Std.STD_TIME_ZONE, std._kind);
    }

    @Test
    public void testFindDeserializer_inetAddressType_returnsStdWithInetAddressKind() {
        FromStringDeserializer.Std std = FromStringDeserializer.findDeserializer(InetAddress.class);
        assertNotNull(std);
        assertEquals(FromStringDeserializer.Std.STD_INET_ADDRESS, std._kind);
    }

    @Test
    public void testFindDeserializer_inetSocketAddressType_returnsStdWithInetSocketAddressKind() {
        FromStringDeserializer.Std std = FromStringDeserializer.findDeserializer(InetSocketAddress.class);
        assertNotNull(std);
        assertEquals(FromStringDeserializer.Std.STD_INET_SOCKET_ADDRESS, std._kind);
    }

    @Test
    public void testFindDeserializer_unknownType_returnsNull() {
        FromStringDeserializer.Std std = FromStringDeserializer.findDeserializer(String.class);
        assertNull(std);
    }

    // ---------- deserialize() via ObjectMapper - normal cases ----------

    @Test
    public void testDeserialize_fileNormalInput_returnsFileObject() throws Exception {
        File f = mapper.readValue("\"/tmp/test.txt\"", File.class);
        assertNotNull(f);
        assertEquals("/tmp/test.txt", f.getPath());
    }

    @Test
    public void testDeserialize_urlNormalInput_returnsUrlObject() throws Exception {
        URL url = mapper.readValue("\"http://example.com\"", URL.class);
        assertNotNull(url);
        assertEquals("http://example.com", url.toString());
    }

    @Test
    public void testDeserialize_uriNormalInput_returnsUriObject() throws Exception {
        URI uri = mapper.readValue("\"http://example.com\"", URI.class);
        assertNotNull(uri);
        assertEquals("http://example.com", uri.toString());
    }

    @Test
    public void testDeserialize_classNormalInput_returnsClassObject() throws Exception {
        Class<?> cls = mapper.readValue("\"java.lang.String\"", Class.class);
        assertEquals(String.class, cls);
    }

    @Test
    public void testDeserialize_currencyNormalInput_returnsCurrencyObject() throws Exception {
        Currency currency = mapper.readValue("\"USD\"", Currency.class);
        assertNotNull(currency);
        assertEquals("USD", currency.getCurrencyCode());
    }

    @Test
    public void testDeserialize_patternNormalInput_returnsPatternObject() throws Exception {
        Pattern p = mapper.readValue("\"[a-z]+\"", Pattern.class);
        assertNotNull(p);
        assertEquals("[a-z]+", p.pattern());
    }

    @Test
    public void testDeserialize_localeSingleArgument_returnsLocaleObject() throws Exception {
        Locale locale = mapper.readValue("\"en\"", Locale.class);
        assertEquals(new Locale("en"), locale);
    }

    @Test
    public void testDeserialize_localeTwoArguments_returnsLocaleObject() throws Exception {
        Locale locale = mapper.readValue("\"en_US\"", Locale.class);
        assertEquals(new Locale("en", "US"), locale);
    }

    @Test
    public void testDeserialize_localeThreeArguments_returnsLocaleObject() throws Exception {
        Locale locale = mapper.readValue("\"en_US_variant\"", Locale.class);
        assertEquals(new Locale("en", "US", "variant"), locale);
    }

    @Test
    public void testDeserialize_charsetNormalInput_returnsCharsetObject() throws Exception {
        Charset cs = mapper.readValue("\"UTF-8\"", Charset.class);
        assertEquals(Charset.forName("UTF-8"), cs);
    }

    @Test
    public void testDeserialize_timeZoneNormalInput_returnsTimeZoneObject() throws Exception {
        TimeZone tz = mapper.readValue("\"UTC\"", TimeZone.class);
        assertNotNull(tz);
        assertEquals("UTC", tz.getID());
    }

    @Test
    public void testDeserialize_inetAddressNormalInput_returnsInetAddressObject() throws Exception {
        InetAddress addr = mapper.readValue("\"127.0.0.1\"", InetAddress.class);
        assertNotNull(addr);
        assertEquals("127.0.0.1", addr.getHostAddress());
    }

    @Test
    public void testDeserialize_inetSocketAddressHostPort_returnsInetSocketAddressObject() throws Exception {
        InetSocketAddress addr = mapper.readValue("\"localhost:8080\"", InetSocketAddress.class);
        assertNotNull(addr);
        assertEquals(8080, addr.getPort());
    }

    @Test
    public void testDeserialize_inetSocketAddressHostOnly_returnsInetSocketAddressObject() throws Exception {
        InetSocketAddress addr = mapper.readValue("\"localhost\"", InetSocketAddress.class);
        assertNotNull(addr);
        assertEquals(0, addr.getPort());
    }

    @Test
    public void testDeserialize_inetSocketAddressBracketedIPv6WithPort_returnsInetSocketAddressObject() throws Exception {
        InetSocketAddress addr = mapper.readValue("\"[::1]:8080\"", InetSocketAddress.class);
        assertNotNull(addr);
        assertEquals(8080, addr.getPort());
    }

    @Test
    public void testDeserialize_inetSocketAddressBracketedIPv6NoPort_returnsInetSocketAddressObject() throws Exception {
        InetSocketAddress addr = mapper.readValue("\"[::1]\"", InetSocketAddress.class);
        assertNotNull(addr);
        assertEquals(0, addr.getPort());
    }

    // ---------- deserialize() edge cases ----------

    @Test
    public void testDeserialize_nullJsonValue_returnsNull() throws Exception {
        File f = mapper.readValue("null", File.class);
        assertNull(f);
    }

    @Test
    public void testDeserialize_emptyStringForFile_returnsNullDefault() throws Exception {
        File f = mapper.readValue("\"\"", File.class);
        assertNull(f);
    }

    @Test
    public void testDeserialize_emptyStringForUri_returnsEmptyUri() throws Exception {
        URI uri = mapper.readValue("\"\"", URI.class);
        assertNotNull(uri);
        assertEquals(URI.create(""), uri);
    }

    @Test
    public void testDeserialize_emptyStringForLocale_returnsRootLocale() throws Exception {
        Locale locale = mapper.readValue("\"\"", Locale.class);
        assertEquals(Locale.ROOT, locale);
    }

    @Test
    public void testDeserialize_blankStringForFile_returnsNullDefault() throws Exception {
        File f = mapper.readValue("\"   \"", File.class);
        assertNull(f);
    }

    @Test
    public void testDeserialize_arrayUnwrapEnabled_returnsSingleValue() throws Exception {
        ObjectMapper localMapper = new ObjectMapper();
        localMapper.enable(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        File f = localMapper.readValue("[\"/tmp/test.txt\"]", File.class);
        assertNotNull(f);
        assertEquals("/tmp/test.txt", f.getPath());
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_arrayUnwrapEnabledMultipleValues_throwsException() throws Exception {
        ObjectMapper localMapper = new ObjectMapper();
        localMapper.enable(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        localMapper.readValue("[\"/tmp/a.txt\", \"/tmp/b.txt\"]", File.class);
    }

    @Test
    public void testDeserialize_embeddedObjectAssignable_returnsSameInstance() throws Exception {
        File original = new File("/tmp/embedded.txt");
        JsonNode node = JsonNodeFactory.instance.pojoNode(original);
        File result = mapper.treeToValue(node, File.class);
        assertNotNull(result);
        assertEquals(original, result);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_embeddedObjectNotAssignable_throwsException() throws Exception {
        Integer original = Integer.valueOf(42);
        JsonNode node = JsonNodeFactory.instance.pojoNode(original);
        mapper.treeToValue(node, File.class);
    }

    // ---------- deserialize() exception cases ----------

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_invalidCurrencyCode_throwsException() throws Exception {
        mapper.readValue("\"NOT_A_CURRENCY\"", Currency.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_invalidPattern_throwsException() throws Exception {
        mapper.readValue("\"[unclosed\"", Pattern.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_invalidClassName_throwsException() throws Exception {
        mapper.readValue("\"com.nonexistent.NoSuchClass\"", Class.class);
    }

    @Test
    public void testDeserialize_inetSocketAddressBracketedNoClosingBracket_throwsInvalidFormatException() {
        try {
            mapper.readValue("\"[::1\"", InetSocketAddress.class);
            fail("Expected exception to be thrown");
        } catch (InvalidFormatException e) {
            assertNotNull(e.getMessage());
        } catch (Exception e) {
            // Wrapped as JsonMappingException in some versions - still acceptable
            assertTrue(e instanceof JsonMappingException);
        }
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_numericTokenForFile_throwsMappingException() throws Exception {
        mapper.readValue("123", File.class);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserialize_booleanTokenForFile_throwsMappingException() throws Exception {
        mapper.readValue("true", File.class);
    }
}

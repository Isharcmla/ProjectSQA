import org.jsoup.nodes.Attributes;
import org.junit.Test;
import static org.junit.Assert.*;

public class ParseSettingsTest {

    @Test
    public void testHtmlDefault_staticInstance_hasLowerCaseSettings() {
        assertFalse(ParseSettings.htmlDefault.preserveTagCase());
    }

    @Test
    public void testPreserveCase_staticInstance_hasPreserveSettings() {
        assertTrue(ParseSettings.preserveCase.preserveTagCase());
    }

    @Test
    public void testConstructor_tagTrueAttributeTrue_preserveTagCaseReturnsTrue() {
        ParseSettings settings = new ParseSettings(true, true);
        assertTrue(settings.preserveTagCase());
    }

    @Test
    public void testConstructor_tagFalseAttributeFalse_preserveTagCaseReturnsFalse() {
        ParseSettings settings = new ParseSettings(false, false);
        assertFalse(settings.preserveTagCase());
    }

    @Test
    public void testPreserveTagCase_whenTrue_returnsTrue() {
        ParseSettings settings = new ParseSettings(true, false);
        assertTrue(settings.preserveTagCase());
    }

    @Test
    public void testPreserveTagCase_whenFalse_returnsFalse() {
        ParseSettings settings = new ParseSettings(false, true);
        assertFalse(settings.preserveTagCase());
    }

    @Test
    public void testNormalizeTag_lowerCaseSetting_convertsToLowerCase() {
        ParseSettings settings = new ParseSettings(false, false);
        String result = settings.normalizeTag("DIV");
        assertEquals("div", result);
    }

    @Test
    public void testNormalizeTag_preserveCaseSetting_keepsOriginalCase() {
        ParseSettings settings = new ParseSettings(true, true);
        String result = settings.normalizeTag("DIV");
        assertEquals("DIV", result);
    }

    @Test
    public void testNormalizeTag_withWhitespace_trimsWhitespace() {
        ParseSettings settings = new ParseSettings(false, false);
        String result = settings.normalizeTag("  span  ");
        assertEquals("span", result);
    }

    @Test
    public void testNormalizeTag_emptyString_returnsEmptyString() {
        ParseSettings settings = new ParseSettings(false, false);
        String result = settings.normalizeTag("");
        assertEquals("", result);
    }

    @Test
    public void testNormalizeTag_onlyWhitespace_returnsEmptyString() {
        ParseSettings settings = new ParseSettings(false, false);
        String result = settings.normalizeTag("   ");
        assertEquals("", result);
    }

    @Test(expected = NullPointerException.class)
    public void testNormalizeTag_nullInput_throwsNullPointerException() {
        ParseSettings settings = new ParseSettings(false, false);
        settings.normalizeTag(null);
    }

    @Test
    public void testNormalizeTag_preserveCaseWithWhitespace_trimsButKeepsCase() {
        ParseSettings settings = new ParseSettings(true, false);
        String result = settings.normalizeTag("  SPAN  ");
        assertEquals("SPAN", result);
    }

    @Test
    public void testNormalizeAttribute_lowerCaseSetting_convertsToLowerCase() {
        ParseSettings settings = new ParseSettings(false, false);
        String result = settings.normalizeAttribute("CLASS");
        assertEquals("class", result);
    }

    @Test
    public void testNormalizeAttribute_preserveCaseSetting_keepsOriginalCase() {
        ParseSettings settings = new ParseSettings(true, true);
        String result = settings.normalizeAttribute("CLASS");
        assertEquals("CLASS", result);
    }

    @Test
    public void testNormalizeAttribute_withWhitespace_trimsWhitespace() {
        ParseSettings settings = new ParseSettings(false, false);
        String result = settings.normalizeAttribute("  id  ");
        assertEquals("id", result);
    }

    @Test
    public void testNormalizeAttribute_emptyString_returnsEmptyString() {
        ParseSettings settings = new ParseSettings(false, false);
        String result = settings.normalizeAttribute("");
        assertEquals("", result);
    }

    @Test
    public void testNormalizeAttribute_onlyWhitespace_returnsEmptyString() {
        ParseSettings settings = new ParseSettings(false, false);
        String result = settings.normalizeAttribute("   ");
        assertEquals("", result);
    }

    @Test(expected = NullPointerException.class)
    public void testNormalizeAttribute_nullInput_throwsNullPointerException() {
        ParseSettings settings = new ParseSettings(false, false);
        settings.normalizeAttribute(null);
    }

    @Test
    public void testNormalizeAttribute_preserveCaseWithWhitespace_trimsButKeepsCase() {
        ParseSettings settings = new ParseSettings(false, true);
        String result = settings.normalizeAttribute("  DATA-ID  ");
        assertEquals("DATA-ID", result);
    }

    @Test
    public void testNormalizeAttributes_lowerCaseSetting_normalizesAttributes() {
        ParseSettings settings = new ParseSettings(false, false);
        Attributes attributes = new Attributes();
        attributes.add("CLASS", "someValue");
        Attributes result = settings.normalizeAttributes(attributes);
        assertNotNull(result);
        assertEquals("someValue", result.get("class"));
    }

    @Test
    public void testNormalizeAttributes_preserveCaseSetting_doesNotNormalize() {
        ParseSettings settings = new ParseSettings(true, true);
        Attributes attributes = new Attributes();
        attributes.add("CLASS", "someValue");
        Attributes result = settings.normalizeAttributes(attributes);
        assertNotNull(result);
        assertEquals("someValue", result.get("CLASS"));
    }

    @Test
    public void testNormalizeAttributes_returnsNonNullAttributesInstance() {
        ParseSettings settings = new ParseSettings(false, false);
        Attributes attributes = new Attributes();
        Attributes result = settings.normalizeAttributes(attributes);
        assertSame(attributes, result);
    }
}

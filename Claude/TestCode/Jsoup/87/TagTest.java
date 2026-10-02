import org.junit.Test;
import static org.junit.Assert.*;

public class TagTest {

    // ---------- getName() ----------
    @Test
    public void testGetName_knownTag_returnsName() {
        Tag tag = Tag.valueOf("div");
        assertEquals("div", tag.getName());
    }

    @Test
    public void testGetName_unknownTag_returnsName() {
        Tag tag = Tag.valueOf("customtag");
        assertEquals("customtag", tag.getName());
    }

    // ---------- valueOf(String) / valueOf(String, ParseSettings) ----------
    @Test
    public void testValueOf_knownTagLowerCase_returnsSameInstance() {
        Tag tag1 = Tag.valueOf("p");
        Tag tag2 = Tag.valueOf("p");
        assertSame(tag1, tag2);
    }

    @Test
    public void testValueOf_unknownTag_createsNewTag() {
        Tag tag = Tag.valueOf("foobar123");
        assertNotNull(tag);
        assertEquals("foobar123", tag.getName());
        assertFalse(tag.isBlock());
        assertTrue(tag.isInline());
    }

    @Test
    public void testValueOf_unknownTagCalledTwice_notSameButEqual() {
        Tag tag1 = Tag.valueOf("unknowntagxyz");
        Tag tag2 = Tag.valueOf("unknowntagxyz");
        assertNotSame(tag1, tag2);
        assertEquals(tag1, tag2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOf_nullTagName_throwsException() {
        Tag.valueOf(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValueOf_emptyTagName_throwsException() {
        Tag.valueOf("");
    }

    @Test
    public void testValueOfWithSettings_preserveCase_differentCaseCreatesUnknownTag() {
        Tag tag = Tag.valueOf("DIV", ParseSettings.preserveCase);
        assertNotNull(tag);
        assertEquals("DIV", tag.getName());
        assertFalse(tag.isBlock());
    }

    @Test
    public void testValueOfWithSettings_knownTagDirectMatch() {
        Tag tag = Tag.valueOf("div", ParseSettings.preserveCase);
        assertTrue(tag.isBlock());
        assertEquals("div", tag.getName());
    }

    // ---------- isBlock() ----------
    @Test
    public void testIsBlock_divTag_returnsTrue() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.isBlock());
    }

    @Test
    public void testIsBlock_spanTag_returnsFalse() {
        Tag tag = Tag.valueOf("span");
        assertFalse(tag.isBlock());
    }

    // ---------- formatAsBlock() ----------
    @Test
    public void testFormatAsBlock_divTag_returnsTrue() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.formatAsBlock());
    }

    @Test
    public void testFormatAsBlock_pTag_returnsFalse() {
        Tag tag = Tag.valueOf("p");
        assertFalse(tag.formatAsBlock());
    }

    // ---------- canContainBlock() (deprecated) ----------
    @Test
    public void testCanContainBlock_divTag_returnsTrueSameAsIsBlock() {
        Tag tag = Tag.valueOf("div");
        assertEquals(tag.isBlock(), tag.canContainBlock());
        assertTrue(tag.canContainBlock());
    }

    @Test
    public void testCanContainBlock_spanTag_returnsFalse() {
        Tag tag = Tag.valueOf("span");
        assertFalse(tag.canContainBlock());
    }

    // ---------- isInline() ----------
    @Test
    public void testIsInline_spanTag_returnsTrue() {
        Tag tag = Tag.valueOf("span");
        assertTrue(tag.isInline());
    }

    @Test
    public void testIsInline_divTag_returnsFalse() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.isInline());
    }

    // ---------- isData() ----------
    @Test
    public void testIsData_divTag_returnsFalse() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.isData());
    }

    @Test
    public void testIsData_imgTag_returnsFalse() {
        Tag tag = Tag.valueOf("img");
        assertFalse(tag.isData());
    }

    @Test
    public void testIsData_scriptTag_returnsFalse() {
        Tag tag = Tag.valueOf("script");
        assertFalse(tag.isData());
    }

    // ---------- isEmpty() ----------
    @Test
    public void testIsEmpty_imgTag_returnsTrue() {
        Tag tag = Tag.valueOf("img");
        assertTrue(tag.isEmpty());
    }

    @Test
    public void testIsEmpty_divTag_returnsFalse() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.isEmpty());
    }

    // ---------- isSelfClosing() ----------
    @Test
    public void testIsSelfClosing_imgTag_returnsTrue() {
        Tag tag = Tag.valueOf("img");
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void testIsSelfClosing_divTag_returnsFalse() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.isSelfClosing());
    }

    // ---------- isKnownTag() instance ----------
    @Test
    public void testIsKnownTag_pTag_returnsTrue() {
        Tag tag = Tag.valueOf("p");
        assertTrue(tag.isKnownTag());
    }

    @Test
    public void testIsKnownTag_unknownTag_returnsFalse() {
        Tag tag = Tag.valueOf("unknownxyzabc");
        assertFalse(tag.isKnownTag());
    }

    // ---------- isKnownTag(String) static ----------
    @Test
    public void testIsKnownTagStatic_knownTag_returnsTrue() {
        assertTrue(Tag.isKnownTag("div"));
    }

    @Test
    public void testIsKnownTagStatic_unknownTag_returnsFalse() {
        assertFalse(Tag.isKnownTag("notarealtag999"));
    }

    @Test
    public void testIsKnownTagStatic_emptyString_returnsFalse() {
        assertFalse(Tag.isKnownTag(""));
    }

    // ---------- preserveWhitespace() ----------
    @Test
    public void testPreserveWhitespace_preTag_returnsTrue() {
        Tag tag = Tag.valueOf("pre");
        assertTrue(tag.preserveWhitespace());
    }

    @Test
    public void testPreserveWhitespace_divTag_returnsFalse() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.preserveWhitespace());
    }

    // ---------- isFormListed() ----------
    @Test
    public void testIsFormListed_inputTag_returnsTrue() {
        Tag tag = Tag.valueOf("input");
        assertTrue(tag.isFormListed());
    }

    @Test
    public void testIsFormListed_divTag_returnsFalse() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.isFormListed());
    }

    // ---------- isFormSubmittable() ----------
    @Test
    public void testIsFormSubmittable_inputTag_returnsTrue() {
        Tag tag = Tag.valueOf("input");
        assertTrue(tag.isFormSubmittable());
    }

    @Test
    public void testIsFormSubmittable_divTag_returnsFalse() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.isFormSubmittable());
    }

    @Test
    public void testIsFormSubmittable_fieldsetTag_returnsFalse() {
        // fieldset is formListed but not formSubmit
        Tag tag = Tag.valueOf("fieldset");
        assertTrue(tag.isFormListed());
        assertFalse(tag.isFormSubmittable());
    }

    // ---------- equals() ----------
    @Test
    public void testEquals_sameInstance_returnsTrue() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.equals(tag));
    }

    @Test
    public void testEquals_sameTagName_returnsTrue() {
        Tag tag1 = Tag.valueOf("div");
        Tag tag2 = Tag.valueOf("div");
        assertTrue(tag1.equals(tag2));
    }

    @Test
    public void testEquals_differentTagName_returnsFalse() {
        Tag tag1 = Tag.valueOf("div");
        Tag tag2 = Tag.valueOf("span");
        assertFalse(tag1.equals(tag2));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.equals(null));
    }

    @Test
    public void testEquals_differentType_returnsFalse() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.equals("div"));
    }

    @Test
    public void testEquals_unknownTagsSameName_returnsTrue() {
        Tag tag1 = Tag.valueOf("customunknown1");
        Tag tag2 = Tag.valueOf("customunknown1");
        assertNotSame(tag1, tag2);
        assertTrue(tag1.equals(tag2));
    }

    // ---------- hashCode() ----------
    @Test
    public void testHashCode_sameTag_sameHashCode() {
        Tag tag1 = Tag.valueOf("div");
        Tag tag2 = Tag.valueOf("div");
        assertEquals(tag1.hashCode(), tag2.hashCode());
    }

    @Test
    public void testHashCode_differentTag_differentHashCode() {
        Tag tag1 = Tag.valueOf("div");
        Tag tag2 = Tag.valueOf("span");
        assertNotEquals(tag1.hashCode(), tag2.hashCode());
    }

    // ---------- toString() ----------
    @Test
    public void testToString_returnsTagName() {
        Tag tag = Tag.valueOf("div");
        assertEquals("div", tag.toString());
    }

    @Test
    public void testToString_unknownTag_returnsTagName() {
        Tag tag = Tag.valueOf("customtagname");
        assertEquals("customtagname", tag.toString());
    }
}

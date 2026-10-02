import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FormElementTest {

    private FormElement standaloneForm;

    @Before
    public void setUp() {
        Tag formTag = Tag.valueOf("form");
        standaloneForm = new FormElement(formTag, "http://example.com/", new Attributes());
    }

    // ---------- Constructor / basic ----------

    @Test
    public void testConstructor_createsStandaloneForm_notNull() {
        assertNotNull(standaloneForm);
        assertEquals("form", standaloneForm.tagName());
    }

    // ---------- elements() ----------

    @Test
    public void testElements_initiallyEmpty_returnsEmptyList() {
        Elements elements = standaloneForm.elements();
        assertNotNull(elements);
        assertEquals(0, elements.size());
    }

    // ---------- addElement() ----------

    @Test
    public void testAddElement_addsElementToList_sizeIncreases() {
        Element input = new Element(Tag.valueOf("input"), "http://example.com/");
        input.attr("name", "test");
        FormElement result = standaloneForm.addElement(input);

        assertEquals(1, standaloneForm.elements().size());
        assertSame(standaloneForm, result); // for chaining
    }

    @Test
    public void testAddElement_multipleElements_allAdded() {
        Element input1 = new Element(Tag.valueOf("input"), "http://example.com/");
        Element input2 = new Element(Tag.valueOf("input"), "http://example.com/");
        standaloneForm.addElement(input1).addElement(input2);

        assertEquals(2, standaloneForm.elements().size());
    }

    // ---------- formData() ----------

    @Test
    public void testFormData_normalTextInput_returnsKeyVal() {
        String html = "<form><input type='text' name='username' value='john'></form>";
        Document doc = Jsoup.parse(html, "http://example.com/");
        FormElement form = (FormElement) doc.select("form").first();

        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("username", data.get(0).key());
        assertEquals("john", data.get(0).value());
    }

    @Test
    public void testFormData_emptyNameSkipped_notIncluded() {
        String html = "<form><input type='text' name='' value='john'></form>";
        Document doc = Jsoup.parse(html, "http://example.com/");
        FormElement form = (FormElement) doc.select("form").first();

        List<Connection.KeyVal> data = form.formData();
        assertEquals(0, data.size());
    }

    @Test
    public void testFormData_notFormSubmittableTagSkipped() {
        String html = "<form><div name='notsubmittable'>text</div></form>";
        Document doc = Jsoup.parse(html, "http://example.com/");
        FormElement form = (FormElement) doc.select("form").first();

        List<Connection.KeyVal> data = form.formData();
        assertEquals(0, data.size());
    }

    @Test
    public void testFormData_selectWithSelectedOption_returnsSelectedValue() {
        String html = "<form><select name='color'>" +
                "<option value='red'>Red</option>" +
                "<option value='blue' selected>Blue</option>" +
                "</select></form>";
        Document doc = Jsoup.parse(html, "http://example.com/");
        FormElement form = (FormElement) doc.select("form").first();

        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("color", data.get(0).key());
        assertEquals("blue", data.get(0).value());
    }

    @Test
    public void testFormData_selectMultipleSelectedOptions_returnsAllSelected() {
        String html = "<form><select name='color' multiple>" +
                "<option value='red' selected>Red</option>" +
                "<option value='blue' selected>Blue</option>" +
                "</select></form>";
        Document doc = Jsoup.parse(html, "http://example.com/");
        FormElement form = (FormElement) doc.select("form").first();

        List<Connection.KeyVal> data = form.formData();
        assertEquals(2, data.size());
    }

    @Test
    public void testFormData_selectWithoutSelectedOption_usesFirstOption() {
        String html = "<form><select name='color'>" +
                "<option value='red'>Red</option>" +
                "<option value='blue'>Blue</option>" +
                "</select></form>";
        Document doc = Jsoup.parse(html, "http://example.com/");
        FormElement form = (FormElement) doc.select("form").first();

        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("red", data.get(0).value());
    }

    @Test
    public void testFormData_selectWithNoOptions_noEntryAdded() {
        String html = "<form><select name='color'></select></form>";
        Document doc = Jsoup.parse(html, "http://example.com/");
        FormElement form = (FormElement) doc.select("form").first();

        List<Connection.KeyVal> data = form.formData();
        assertEquals(0, data.size());
    }

    @Test
    public void testFormData_checkboxChecked_includesValue() {
        String html = "<form><input type='checkbox' name='agree' value='yes' checked></form>";
        Document doc = Jsoup.parse(html, "http://example.com/");
        FormElement form = (FormElement) doc.select("form").first();

        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("agree", data.get(0).key());
        assertEquals("yes", data.get(0).value());
    }

    @Test
    public void testFormData_checkboxNotChecked_excludedFromData() {
        String html = "<form><input type='checkbox' name='agree' value='yes'></form>";
        Document doc = Jsoup.parse(html, "http://example.com/");
        FormElement form = (FormElement) doc.select("form").first();

        List<Connection.KeyVal> data = form.formData();
        assertEquals(0, data.size());
    }

    @Test
    public void testFormData_radioChecked_includesValue() {
        String html = "<form><input type='radio' name='gender' value='male' checked></form>";
        Document doc = Jsoup.parse(html, "http://example.com/");
        FormElement form = (FormElement) doc.select("form").first();

        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("gender", data.get(0).key());
        assertEquals("male", data.get(0).value());
    }

    @Test
    public void testFormData_radioNotChecked_excludedFromData() {
        String html = "<form><input type='radio' name='gender' value='male'></form>";
        Document doc = Jsoup.parse(html, "http://example.com/");
        FormElement form = (FormElement) doc.select("form").first();

        List<Connection.KeyVal> data = form.formData();
        assertEquals(0, data.size());
    }

    @Test
    public void testFormData_multipleInputTypes_combinedCorrectly() {
        String html = "<form>" +
                "<input type='text' name='username' value='john'>" +
                "<input type='checkbox' name='agree' value='yes' checked>" +
                "<input type='radio' name='gender' value='male' checked>" +
                "<select name='color'><option value='red' selected>Red</option></select>" +
                "</form>";
        Document doc = Jsoup.parse(html, "http://example.com/");
        FormElement form = (FormElement) doc.select("form").first();

        List<Connection.KeyVal> data = form.formData();
        assertEquals(4, data.size());
    }

    @Test
    public void testFormData_emptyForm_returnsEmptyList() {
        List<Connection.KeyVal> data = standaloneForm.formData();
        assertNotNull(data);
        assertEquals(0, data.size());
    }

    // ---------- submit() ----------

    @Test
    public void testSubmit_withActionAttribute_returnsConnectionWithAction() {
        String html = "<form action='http://example.com/submit' method='post'>" +
                "<input type='text' name='username' value='john'></form>";
        Document doc = Jsoup.parse(html, "http://example.com/");
        FormElement form = (FormElement) doc.select("form").first();

        Connection con = form.submit();
        assertNotNull(con);
        assertEquals("http://example.com/submit", con.request().url().toString());
        assertEquals(Connection.Method.POST, con.request().method());
    }

    @Test
    public void testSubmit_withoutActionUsesBaseUri_getMethod() {
        String html = "<form><input type='text' name='username' value='john'></form>";
        Document doc = Jsoup.parse(html, "http://example.com/");
        FormElement form = (FormElement) doc.select("form").first();

        Connection con = form.submit();
        assertNotNull(con);
        assertEquals("http://example.com/", con.request().url().toString());
        assertEquals(Connection.Method.GET, con.request().method());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubmit_noActionNoBaseUri_throwsIllegalArgumentException() {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        form.submit(); // should throw because action cannot be determined
    }

    @Test
    public void testSubmit_methodGetExplicit_returnsGetConnection() {
        String html = "<form action='http://example.com/submit' method='get'>" +
                "<input type='text' name='username' value='john'></form>";
        Document doc = Jsoup.parse(html, "http://example.com/");
        FormElement form = (FormElement) doc.select("form").first();

        Connection con = form.submit();
        assertEquals(Connection.Method.GET, con.request().method());
    }

    @Test
    public void testSubmit_methodPostCaseInsensitive_returnsPostConnection() {
        String html = "<form action='http://example.com/submit' method='POST'>" +
                "<input type='text' name='username' value='john'></form>";
        Document doc = Jsoup.parse(html, "http://example.com/");
        FormElement form = (FormElement) doc.select("form").first();

        Connection con = form.submit();
        assertEquals(Connection.Method.POST, con.request().method());
    }

    // ---------- equals() ----------

    @Test
    public void testEquals_sameObjectReference_returnsTrue() {
        assertTrue(standaloneForm.equals(standaloneForm));
    }

    @Test
    public void testEquals_differentObject_returnsFalse() {
        FormElement other = new FormElement(Tag.valueOf("form"), "http://other.com/", new Attributes());
        assertFalse(standaloneForm.equals(other));
    }

    @Test
    public void testEquals_nullObject_returnsFalse() {
        assertFalse(standaloneForm.equals(null));
    }
}

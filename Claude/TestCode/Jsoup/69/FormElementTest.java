import org.jsoup.Jsoup;
import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.Before;

import java.util.List;

import static org.junit.Assert.*;

public class FormElementTest {

    private FormElement newForm() {
        Tag tag = Tag.valueOf("form");
        Attributes attrs = new Attributes();
        return new FormElement(tag, "http://example.com/", attrs);
    }

    private Element newInput(String html) {
        Document doc = Jsoup.parse(html, "http://example.com/");
        return doc.body().child(0);
    }

    // ---------- elements() ----------

    @Test
    public void testElements_initiallyEmpty_returnsEmptyElements() {
        FormElement form = newForm();
        Elements elements = form.elements();
        assertNotNull(elements);
        assertEquals(0, elements.size());
    }

    // ---------- addElement() ----------

    @Test
    public void testAddElement_addsElement_returnsFormElementForChaining() {
        FormElement form = newForm();
        Element input = newInput("<input type='text' name='foo' value='bar'>");
        FormElement result = form.addElement(input);
        assertSame(form, result);
        assertEquals(1, form.elements().size());
        assertEquals(input, form.elements().get(0));
    }

    // ---------- formData() ----------

    @Test
    public void testFormData_withTextInput_returnsKeyVal() {
        FormElement form = newForm();
        Element input = newInput("<input type='text' name='username' value='john'>");
        form.addElement(input);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("username", data.get(0).key());
        assertEquals("john", data.get(0).value());
    }

    @Test
    public void testFormData_withDisabledInput_skipsElement() {
        FormElement form = newForm();
        Element input = newInput("<input type='text' name='username' value='john' disabled>");
        form.addElement(input);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(0, data.size());
    }

    @Test
    public void testFormData_withEmptyName_skipsElement() {
        FormElement form = newForm();
        Element input = newInput("<input type='text' name='' value='john'>");
        form.addElement(input);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(0, data.size());
    }

    @Test
    public void testFormData_withSelectAndSelectedOption_returnsSelectedValue() {
        FormElement form = newForm();
        String html = "<select name='fruit'><option value='apple'>Apple</option>" +
                "<option value='banana' selected>Banana</option></select>";
        Element select = newInput(html);
        form.addElement(select);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("fruit", data.get(0).key());
        assertEquals("banana", data.get(0).value());
    }

    @Test
    public void testFormData_withSelectMultipleSelectedOptions_returnsAllSelectedValues() {
        FormElement form = newForm();
        String html = "<select name='fruit' multiple><option value='apple' selected>Apple</option>" +
                "<option value='banana' selected>Banana</option></select>";
        Element select = newInput(html);
        form.addElement(select);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(2, data.size());
        assertEquals("apple", data.get(0).value());
        assertEquals("banana", data.get(1).value());
    }

    @Test
    public void testFormData_withSelectNoSelectedOption_returnsFirstOption() {
        FormElement form = newForm();
        String html = "<select name='fruit'><option value='apple'>Apple</option>" +
                "<option value='banana'>Banana</option></select>";
        Element select = newInput(html);
        form.addElement(select);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("fruit", data.get(0).key());
        assertEquals("apple", data.get(0).value());
    }

    @Test
    public void testFormData_withSelectNoOptions_returnsNoData() {
        FormElement form = newForm();
        String html = "<select name='fruit'></select>";
        Element select = newInput(html);
        form.addElement(select);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(0, data.size());
    }

    @Test
    public void testFormData_withCheckboxChecked_returnsOnValue() {
        FormElement form = newForm();
        Element checkbox = newInput("<input type='checkbox' name='agree' checked>");
        form.addElement(checkbox);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("agree", data.get(0).key());
        assertEquals("on", data.get(0).value());
    }

    @Test
    public void testFormData_withCheckboxCheckedHasValue_returnsValue() {
        FormElement form = newForm();
        Element checkbox = newInput("<input type='checkbox' name='agree' value='yes' checked>");
        form.addElement(checkbox);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("agree", data.get(0).key());
        assertEquals("yes", data.get(0).value());
    }

    @Test
    public void testFormData_withCheckboxNotChecked_skipsElement() {
        FormElement form = newForm();
        Element checkbox = newInput("<input type='checkbox' name='agree'>");
        form.addElement(checkbox);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(0, data.size());
    }

    @Test
    public void testFormData_withRadioChecked_returnsValue() {
        FormElement form = newForm();
        Element radio = newInput("<input type='radio' name='gender' value='male' checked>");
        form.addElement(radio);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("gender", data.get(0).key());
        assertEquals("male", data.get(0).value());
    }

    @Test
    public void testFormData_withNonSubmittableTag_skipsElement() {
        FormElement form = newForm();
        Element div = newInput("<div name='notsubmittable'>text</div>");
        form.addElement(div);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(0, data.size());
    }

    @Test
    public void testFormData_withMultipleElements_returnsAllValidData() {
        FormElement form = newForm();
        Element input1 = newInput("<input type='text' name='username' value='john'>");
        Element input2 = newInput("<input type='text' name='password' value='secret'>");
        form.addElement(input1);
        form.addElement(input2);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(2, data.size());
    }

    @Test
    public void testFormData_withEmptyElements_returnsEmptyList() {
        FormElement form = newForm();
        List<Connection.KeyVal> data = form.formData();
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

        Connection connection = form.submit();
        assertNotNull(connection);
    }

    @Test
    public void testSubmit_withoutActionUsesBaseUri_returnsConnection() {
        String html = "<form><input type='text' name='username' value='john'></form>";
        Document doc = Jsoup.parse(html, "http://example.com/base/");
        FormElement form = (FormElement) doc.select("form").first();

        Connection connection = form.submit();
        assertNotNull(connection);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubmit_withoutActionAndBaseUri_throwsIllegalArgumentException() {
        String html = "<form><input type='text' name='username' value='john'></form>";
        Document doc = Jsoup.parse(html, "");
        FormElement form = (FormElement) doc.select("form").first();

        form.submit();
    }

    @Test
    public void testSubmit_withPostMethod_usesPostMethod() {
        String html = "<form action='http://example.com/submit' method='POST'>" +
                "<input type='text' name='username' value='john'></form>";
        Document doc = Jsoup.parse(html, "http://example.com/");
        FormElement form = (FormElement) doc.select("form").first();

        Connection connection = form.submit();
        assertEquals(Connection.Method.POST, connection.request().method());
    }

    @Test
    public void testSubmit_withGetMethodDefault_usesGetMethod() {
        String html = "<form action='http://example.com/submit'>" +
                "<input type='text' name='username' value='john'></form>";
        Document doc = Jsoup.parse(html, "http://example.com/");
        FormElement form = (FormElement) doc.select("form").first();

        Connection connection = form.submit();
        assertEquals(Connection.Method.GET, connection.request().method());
    }

    @Test
    public void testSubmit_withExplicitGetMethod_usesGetMethod() {
        String html = "<form action='http://example.com/submit' method='GET'>" +
                "<input type='text' name='username' value='john'></form>";
        Document doc = Jsoup.parse(html, "http://example.com/");
        FormElement form = (FormElement) doc.select("form").first();

        Connection connection = form.submit();
        assertEquals(Connection.Method.GET, connection.request().method());
    }
}

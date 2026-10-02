package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.parser.Tag;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class FormElementTest {

    @Test
    public void testConstructorAndElements_emptyByDefault() {
        Tag formTag = Tag.valueOf("form");
        Attributes attributes = new Attributes();
        FormElement form = new FormElement(formTag, "http://example.com", attributes);

        assertNotNull(form.elements());
        assertTrue(form.elements().isEmpty());
    }

    @Test
    public void testAddElement_fluentReturnAndListUpdated() {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        Element input = new Element(Tag.valueOf("input"), "http://example.com");

        FormElement returnedForm = form.addElement(input);

        assertSame(form, returnedForm);
        assertEquals(1, form.elements().size());
        assertSame(input, form.elements().get(0));
    }

    @Test
    public void testSubmit_withActionAndMethodPost() {
        Document doc = Jsoup.parse("<form action='/submit' method='post'><input name='user' value='test'/></form>", "http://example.com/");
        FormElement form = (FormElement) doc.select("form").first();

        Connection con = form.submit();

        assertEquals("http://example.com/submit", con.request().url().toExternalForm());
        assertEquals(Connection.Method.POST, con.request().method());
        assertEquals(1, con.request().data().size());
        assertEquals("user", con.request().data().iterator().next().key());
        assertEquals("test", con.request().data().iterator().next().value());
    }

    @Test
    public void testSubmit_withoutActionUsesBaseUriAndDefaultMethodGet() {
        Document doc = Jsoup.parse("<form><input name='q' value='search'/></form>", "http://example.com/search");
        FormElement form = (FormElement) doc.select("form").first();

        Connection con = form.submit();

        assertEquals("http://example.com/search", con.request().url().toExternalForm());
        assertEquals(Connection.Method.GET, con.request().method());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubmit_emptyActionAndEmptyBaseUri_throwsIllegalArgumentException() {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        form.submit();
    }

    @Test
    public void testFormData_skipsNonFormSubmittableElements() {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        Element div = new Element(Tag.valueOf("div"), "http://example.com");
        div.attr("name", "ignoredDiv");
        div.text("some text");
        form.addElement(div);

        List<Connection.KeyVal> data = form.formData();

        assertTrue(data.isEmpty());
    }

    @Test
    public void testFormData_skipsDisabledElements() {
        Document doc = Jsoup.parse("<form><input name='foo' value='bar' disabled/></form>");
        FormElement form = (FormElement) doc.select("form").first();

        List<Connection.KeyVal> data = form.formData();

        assertTrue(data.isEmpty());
    }

    @Test
    public void testFormData_skipsElementsWithEmptyName() {
        Document doc = Jsoup.parse("<form><input name='' value='bar'/><input value='baz'/></form>");
        FormElement form = (FormElement) doc.select("form").first();

        List<Connection.KeyVal> data = form.formData();

        assertTrue(data.isEmpty());
    }

    @Test
    public void testFormData_standardInputAndTextarea_accumulatesValues() {
        Document doc = Jsoup.parse("<form><input name='username' value='admin'/><textarea name='comment'>my comment</textarea></form>");
        FormElement form = (FormElement) doc.select("form").first();

        List<Connection.KeyVal> data = form.formData();

        assertEquals(2, data.size());
        assertEquals("username", data.get(0).key());
        assertEquals("admin", data.get(0).value());
        assertEquals("comment", data.get(1).key());
        assertEquals("my comment", data.get(1).value());
    }

    @Test
    public void testFormData_selectWithExplicitlySelectedOptions() {
        String html = "<form>" +
                "<select name='multi' multiple>" +
                "<option value='one' selected>One</option>" +
                "<option value='two'>Two</option>" +
                "<option value='three' selected>Three</option>" +
                "</select>" +
                "</form>";
        Document doc = Jsoup.parse(html);
        FormElement form = (FormElement) doc.select("form").first();

        List<Connection.KeyVal> data = form.formData();

        assertEquals(2, data.size());
        assertEquals("multi", data.get(0).key());
        assertEquals("one", data.get(0).value());
        assertEquals("multi", data.get(1).key());
        assertEquals("three", data.get(1).value());
    }

    @Test
    public void testFormData_selectWithoutSelectedOption_defaultsToFirstOption() {
        String html = "<form>" +
                "<select name='choice'>" +
                "<option value='first'>First</option>" +
                "<option value='second'>Second</option>" +
                "</select>" +
                "</form>";
        Document doc = Jsoup.parse(html);
        FormElement form = (FormElement) doc.select("form").first();

        List<Connection.KeyVal> data = form.formData();

        assertEquals(1, data.size());
        assertEquals("choice", data.get(0).key());
        assertEquals("first", data.get(0).value());
    }

    @Test
    public void testFormData_selectWithNoOptions_addsNothing() {
        Document doc = Jsoup.parse("<form><select name='emptySelect'></select></form>");
        FormElement form = (FormElement) doc.select("form").first();

        List<Connection.KeyVal> data = form.formData();

        assertTrue(data.isEmpty());
    }

    @Test
    public void testFormData_checkboxAndRadio_checkedWithValue() {
        String html = "<form>" +
                "<input type='checkbox' name='chk1' value='customVal' checked/>" +
                "<input type='radio' name='rad1' value='radioVal' checked/>" +
                "</form>";
        Document doc = Jsoup.parse(html);
        FormElement form = (FormElement) doc.select("form").first();

        List<Connection.KeyVal> data = form.formData();

        assertEquals(2, data.size());
        assertEquals("chk1", data.get(0).key());
        assertEquals("customVal", data.get(0).value());
        assertEquals("rad1", data.get(1).key());
        assertEquals("radioVal", data.get(1).value());
    }

    @Test
    public void testFormData_checkboxAndRadio_checkedWithoutValue_defaultsToOn() {
        String html = "<form>" +
                "<input type='checkbox' name='chk1' checked/>" +
                "<input type='RADIO' name='rad1' checked/>" +
                "</form>";
        Document doc = Jsoup.parse(html);
        FormElement form = (FormElement) doc.select("form").first();

        List<Connection.KeyVal> data = form.formData();

        assertEquals(2, data.size());
        assertEquals("chk1", data.get(0).key());
        assertEquals("on", data.get(0).value());
        assertEquals("rad1", data.get(1).key());
        assertEquals("on", data.get(1).value());
    }

    @Test
    public void testFormData_checkboxAndRadio_unchecked_skipped() {
        String html = "<form>" +
                "<input type='checkbox' name='chk1' value='val1'/>" +
                "<input type='radio' name='rad1' value='val2'/>" +
                "</form>";
        Document doc = Jsoup.parse(html);
        FormElement form = (FormElement) doc.select("form").first();

        List<Connection.KeyVal> data = form.formData();

        assertTrue(data.isEmpty());
    }
}

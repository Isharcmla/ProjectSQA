package org.jsoup.nodes;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.lang.Integer;
import java.lang.String;

public class Element_outerHtmlTail_81219980089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7567;
     Object term7618;
     Object term7620;

    public Element_outerHtmlTail_81219980089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7589 = new ArrayList();
        ((ArrayList) term7589).add((Object)null);
        ((ArrayList) term7589).add((Object)null);
        ((ArrayList) term7589).add((Object)null);
        ((ArrayList) term7589).add((Object)null);
        ((ArrayList) term7589).add((Object)null);
        ((ArrayList) term7589).add((Object)null);
        ((ArrayList) term7589).add((Object)null);
        ((ArrayList) term7589).add((Object)null);
        ((ArrayList) term7589).add((Object)null);
        LinkedHashMap term7594 = new LinkedHashMap();
        term7567 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7568 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7593 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7568, term7568.getClass(), "tagName", "hIYsRyOZxk");
        setBooleanField(term7568, term7568.getClass(), "isBlock", true);
        setBooleanField(term7568, term7568.getClass(), "formatAsBlock", true);
        setBooleanField(term7568, term7568.getClass(), "canContainInline", true);
        setBooleanField(term7568, term7568.getClass(), "empty", false);
        setBooleanField(term7568, term7568.getClass(), "selfClosing", true);
        setBooleanField(term7568, term7568.getClass(), "preserveWhitespace", true);
        setBooleanField(term7568, term7568.getClass(), "formList", true);
        setBooleanField(term7568, term7568.getClass(), "formSubmit", false);
        setField(term7567, term7567.getClass(), "tag", term7568);
        setField(term7567, term7567.getClass(), "parentNode", null);
        setField(term7567, term7567.getClass(), "childNodes", term7589);
        setField(term7593, term7593.getClass(), "attributes", term7594);
        setField(term7567, term7567.getClass(), "attributes", term7593);
        setField(term7567, term7567.getClass(), "baseUri", "fVdTcjgHdw");
        setIntField(term7567, term7567.getClass(), "siblingIndex", 1358829571);
        term7618 = new Integer(991356662);
        Class<? extends Object> term7653 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term7652 = ((Class) term7653).getDeclaredField((String) "html");
        ((Field) term7652).setAccessible(true);
        Object enum1 = ((Field) term7652).get((Object) null);
        term7620 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term7620, term7620.getClass(), "escapeMode", null);
        setField(term7620, term7620.getClass(), "charset", null);
        setBooleanField(term7620, term7620.getClass(), "prettyPrint", true);
        setBooleanField(term7620, term7620.getClass(), "outline", true);
        setIntField(term7620, term7620.getClass(), "indentAmount", -506958186);
        setField(term7620, term7620.getClass(), "syntax", enum1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term7618;
        args[2] = term7620;
        callMethod(klass, "outerHtmlTail", argTypes, term7567, args);
    }

};



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

public class Element_outerHtmlHead_115230154488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7218;
     Object term7269;
     Object term7271;

    public Element_outerHtmlHead_115230154488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7240 = new ArrayList();
        ((ArrayList) term7240).add((Object)null);
        ((ArrayList) term7240).add((Object)null);
        ((ArrayList) term7240).add((Object)null);
        LinkedHashMap term7245 = new LinkedHashMap();
        term7218 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7219 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7244 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7219, term7219.getClass(), "tagName", "vBnWPlsZMk");
        setBooleanField(term7219, term7219.getClass(), "isBlock", false);
        setBooleanField(term7219, term7219.getClass(), "formatAsBlock", false);
        setBooleanField(term7219, term7219.getClass(), "canContainInline", false);
        setBooleanField(term7219, term7219.getClass(), "empty", false);
        setBooleanField(term7219, term7219.getClass(), "selfClosing", false);
        setBooleanField(term7219, term7219.getClass(), "preserveWhitespace", false);
        setBooleanField(term7219, term7219.getClass(), "formList", false);
        setBooleanField(term7219, term7219.getClass(), "formSubmit", true);
        setField(term7218, term7218.getClass(), "tag", term7219);
        setField(term7218, term7218.getClass(), "parentNode", null);
        setField(term7218, term7218.getClass(), "childNodes", term7240);
        setField(term7244, term7244.getClass(), "attributes", term7245);
        setField(term7218, term7218.getClass(), "attributes", term7244);
        setField(term7218, term7218.getClass(), "baseUri", "QNjNTLlUaV");
        setIntField(term7218, term7218.getClass(), "siblingIndex", -1239406390);
        term7269 = new Integer(1557431527);
        Class<? extends Object> term7319 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term7318 = ((Class) term7319).getDeclaredField((String) "html");
        ((Field) term7318).setAccessible(true);
        Object enum0 = ((Field) term7318).get((Object) null);
        term7271 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term7271, term7271.getClass(), "escapeMode", null);
        setField(term7271, term7271.getClass(), "charset", null);
        setBooleanField(term7271, term7271.getClass(), "prettyPrint", true);
        setBooleanField(term7271, term7271.getClass(), "outline", false);
        setIntField(term7271, term7271.getClass(), "indentAmount", -1504890659);
        setField(term7271, term7271.getClass(), "syntax", enum0);
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
        args[1] = term7269;
        args[2] = term7271;
        callMethod(klass, "outerHtmlHead", argTypes, term7218, args);
    }

};



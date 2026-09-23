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

public class Element_outerHtmlHead_92961047484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7038;
     Object term7090;
     Object term7110;
     Object term7112;

    public Element_outerHtmlHead_92961047484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7061 = new ArrayList();
        ((ArrayList) term7061).add((Object)null);
        LinkedHashMap term7066 = new LinkedHashMap();
        term7038 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7039 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7065 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7039, term7039.getClass(), "tagName", "DSFGlcaXUb");
        setBooleanField(term7039, term7039.getClass(), "isBlock", false);
        setBooleanField(term7039, term7039.getClass(), "formatAsBlock", true);
        setBooleanField(term7039, term7039.getClass(), "canContainBlock", true);
        setBooleanField(term7039, term7039.getClass(), "canContainInline", true);
        setBooleanField(term7039, term7039.getClass(), "empty", true);
        setBooleanField(term7039, term7039.getClass(), "selfClosing", true);
        setBooleanField(term7039, term7039.getClass(), "preserveWhitespace", false);
        setBooleanField(term7039, term7039.getClass(), "formList", true);
        setBooleanField(term7039, term7039.getClass(), "formSubmit", false);
        setField(term7038, term7038.getClass(), "tag", term7039);
        setField(term7038, term7038.getClass(), "parentNode", null);
        setField(term7038, term7038.getClass(), "childNodes", term7061);
        setField(term7065, term7065.getClass(), "attributes", term7066);
        setField(term7038, term7038.getClass(), "attributes", term7065);
        setField(term7038, term7038.getClass(), "baseUri", "VUkRVwROTl");
        setIntField(term7038, term7038.getClass(), "siblingIndex", -461771056);
        term7090 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term7091 = (byte[]) newByteArray(16);
        setField(term7090, term7090.getClass(), "value", term7091);
        setByteField(term7090, term7090.getClass(), "coder", (byte) 75);
        setIntField(term7090, term7090.getClass(), "count", -243422082);
        term7110 = new Integer(1384592638);
        Class<? extends Object> term7176 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term7175 = ((Class) term7176).getDeclaredField((String) "html");
        ((Field) term7175).setAccessible(true);
        Object enum0 = ((Field) term7175).get((Object) null);
        term7112 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term7112, term7112.getClass(), "escapeMode", null);
        setField(term7112, term7112.getClass(), "charset", null);
        setField(term7112, term7112.getClass(), "charsetEncoder", null);
        setBooleanField(term7112, term7112.getClass(), "prettyPrint", false);
        setBooleanField(term7112, term7112.getClass(), "outline", false);
        setIntField(term7112, term7112.getClass(), "indentAmount", -1002370457);
        setField(term7112, term7112.getClass(), "syntax", enum0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term7090;
        args[1] = term7110;
        args[2] = term7112;
        callMethod(klass, "outerHtmlHead", argTypes, term7038, args);
    }

};



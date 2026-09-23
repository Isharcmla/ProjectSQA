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

public class Element_outerHtmlTail_126971221885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7424;
     Object term7476;
     Object term7496;
     Object term7498;

    public Element_outerHtmlTail_126971221885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7447 = new ArrayList();
        ((ArrayList) term7447).add((Object)null);
        ((ArrayList) term7447).add((Object)null);
        ((ArrayList) term7447).add((Object)null);
        ((ArrayList) term7447).add((Object)null);
        ((ArrayList) term7447).add((Object)null);
        LinkedHashMap term7452 = new LinkedHashMap();
        term7424 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7425 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7451 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7425, term7425.getClass(), "tagName", "UDlkdccCRn");
        setBooleanField(term7425, term7425.getClass(), "isBlock", false);
        setBooleanField(term7425, term7425.getClass(), "formatAsBlock", false);
        setBooleanField(term7425, term7425.getClass(), "canContainBlock", true);
        setBooleanField(term7425, term7425.getClass(), "canContainInline", true);
        setBooleanField(term7425, term7425.getClass(), "empty", true);
        setBooleanField(term7425, term7425.getClass(), "selfClosing", true);
        setBooleanField(term7425, term7425.getClass(), "preserveWhitespace", false);
        setBooleanField(term7425, term7425.getClass(), "formList", false);
        setBooleanField(term7425, term7425.getClass(), "formSubmit", false);
        setField(term7424, term7424.getClass(), "tag", term7425);
        setField(term7424, term7424.getClass(), "parentNode", null);
        setField(term7424, term7424.getClass(), "childNodes", term7447);
        setField(term7451, term7451.getClass(), "attributes", term7452);
        setField(term7424, term7424.getClass(), "attributes", term7451);
        setField(term7424, term7424.getClass(), "baseUri", "pXxkiXgQnq");
        setIntField(term7424, term7424.getClass(), "siblingIndex", -2014576105);
        term7476 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term7477 = (byte[]) newByteArray(16);
        setField(term7476, term7476.getClass(), "value", term7477);
        setByteField(term7476, term7476.getClass(), "coder", (byte) 18);
        setIntField(term7476, term7476.getClass(), "count", 1296895584);
        term7496 = new Integer(628918458);
        Class<? extends Object> term7547 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term7546 = ((Class) term7547).getDeclaredField((String) "html");
        ((Field) term7546).setAccessible(true);
        Object enum1 = ((Field) term7546).get((Object) null);
        term7498 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term7498, term7498.getClass(), "escapeMode", null);
        setField(term7498, term7498.getClass(), "charset", null);
        setField(term7498, term7498.getClass(), "charsetEncoder", null);
        setBooleanField(term7498, term7498.getClass(), "prettyPrint", true);
        setBooleanField(term7498, term7498.getClass(), "outline", true);
        setIntField(term7498, term7498.getClass(), "indentAmount", -1274456137);
        setField(term7498, term7498.getClass(), "syntax", enum1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term7476;
        args[1] = term7496;
        args[2] = term7498;
        callMethod(klass, "outerHtmlTail", argTypes, term7424, args);
    }

};



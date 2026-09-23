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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.lang.Integer;
import java.lang.String;

public class DocumentType_outerHtmlHead_4720243997 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129;
     Object term159;
     Object term161;

    public DocumentType_outerHtmlHead_4720243997() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term130 = new ArrayList();
        ((ArrayList) term130).add((Object)null);
        ((ArrayList) term130).add((Object)null);
        ((ArrayList) term130).add((Object)null);
        ((ArrayList) term130).add((Object)null);
        LinkedHashMap term135 = new LinkedHashMap();
        term129 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        Object term134 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term129, term129.getClass(), "parentNode", null);
        setField(term129, term129.getClass(), "childNodes", term130);
        setField(term134, term134.getClass(), "attributes", term135);
        setField(term129, term129.getClass(), "attributes", term134);
        setField(term129, term129.getClass(), "baseUri", "uuaPigETmJ");
        setIntField(term129, term129.getClass(), "siblingIndex", 1162663216);
        term159 = new Integer(1484323161);
        Class<? extends Object> term1634 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term1633 = ((Class) term1634).getDeclaredField((String) "html");
        ((Field) term1633).setAccessible(true);
        Object enum2 = ((Field) term1633).get((Object) null);
        term161 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term161, term161.getClass(), "escapeMode", null);
        setField(term161, term161.getClass(), "charset", null);
        setBooleanField(term161, term161.getClass(), "prettyPrint", false);
        setBooleanField(term161, term161.getClass(), "outline", false);
        setIntField(term161, term161.getClass(), "indentAmount", 391863371);
        setField(term161, term161.getClass(), "syntax", enum2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.DocumentType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term159;
        args[2] = term161;
        try {
            callMethod(klass, "outerHtmlHead", argTypes, term129, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



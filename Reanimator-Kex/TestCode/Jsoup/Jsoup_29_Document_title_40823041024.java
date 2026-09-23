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
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Document_title_40823041024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1003;

    public Document_title_40823041024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10155 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term10154 = ((Class) term10155).getDeclaredField((String) "limitedQuirks");
        ((Field) term10154).setAccessible(true);
        Object enum24 = ((Field) term10154).get((Object) null);
        HashMap term1045 = new HashMap();
        Set<Object> term10385 =  ((Map) term1045).keySet();
        HashSet term1044 = new HashSet((Collection<? extends Object>) term10385);
        ArrayList term1055 = new ArrayList();
        ((ArrayList) term1055).add((Object)null);
        ((ArrayList) term1055).add((Object)null);
        ((ArrayList) term1055).add((Object)null);
        ((ArrayList) term1055).add((Object)null);
        ((ArrayList) term1055).add((Object)null);
        ((ArrayList) term1055).add((Object)null);
        LinkedHashMap term1060 = new LinkedHashMap();
        term1003 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term1004 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term1024 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1059 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1004, term1004.getClass(), "escapeMode", null);
        setField(term1004, term1004.getClass(), "charset", null);
        setField(term1004, term1004.getClass(), "charsetEncoder", null);
        setBooleanField(term1004, term1004.getClass(), "prettyPrint", true);
        setIntField(term1004, term1004.getClass(), "indentAmount", -1955890973);
        setField(term1003, term1003.getClass(), "outputSettings", term1004);
        setField(term1003, term1003.getClass(), "quirksMode", enum24);
        setField(term1024, term1024.getClass(), "tagName", "flxyYxBRtu");
        setBooleanField(term1024, term1024.getClass(), "isBlock", false);
        setBooleanField(term1024, term1024.getClass(), "formatAsBlock", false);
        setBooleanField(term1024, term1024.getClass(), "canContainBlock", false);
        setBooleanField(term1024, term1024.getClass(), "canContainInline", true);
        setBooleanField(term1024, term1024.getClass(), "empty", true);
        setBooleanField(term1024, term1024.getClass(), "selfClosing", true);
        setBooleanField(term1024, term1024.getClass(), "preserveWhitespace", true);
        setField(term1003, term1003.getClass(), "tag", term1024);
        setField(term1003, term1003.getClass(), "classNames", term1044);
        setField(term1003, term1003.getClass(), "parentNode", null);
        setField(term1003, term1003.getClass(), "childNodes", term1055);
        setField(term1059, term1059.getClass(), "attributes", term1060);
        setField(term1003, term1003.getClass(), "attributes", term1059);
        setField(term1003, term1003.getClass(), "baseUri", "AijpHYOFuy");
        setIntField(term1003, term1003.getClass(), "siblingIndex", -2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SbAoxhfrkn";
        try {
            callMethod(klass, "title", argTypes, term1003, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



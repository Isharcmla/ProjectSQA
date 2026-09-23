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

public class Document_clone_70090252433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4071;

    public Document_clone_70090252433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16769 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term16768 = ((Class) term16769).getDeclaredField((String) "quirks");
        ((Field) term16768).setAccessible(true);
        Object enum40 = ((Field) term16768).get((Object) null);
        HashMap term4106 = new HashMap();
        Set<Object> term16978 =  ((Map) term4106).keySet();
        HashSet term4105 = new HashSet((Collection<? extends Object>) term16978);
        ArrayList term4126 = new ArrayList();
        ((ArrayList) term4126).add((Object)null);
        ((ArrayList) term4126).add((Object)null);
        LinkedHashMap term4131 = new LinkedHashMap();
        term4071 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term4072 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term4085 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4130 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4072, term4072.getClass(), "escapeMode", null);
        setField(term4072, term4072.getClass(), "charset", null);
        setField(term4072, term4072.getClass(), "charsetEncoder", null);
        setBooleanField(term4072, term4072.getClass(), "prettyPrint", true);
        setIntField(term4072, term4072.getClass(), "indentAmount", 590364439);
        setField(term4071, term4071.getClass(), "outputSettings", term4072);
        setField(term4071, term4071.getClass(), "quirksMode", enum40);
        setField(term4085, term4085.getClass(), "tagName", "PznxWXsZME");
        setBooleanField(term4085, term4085.getClass(), "isBlock", false);
        setBooleanField(term4085, term4085.getClass(), "formatAsBlock", true);
        setBooleanField(term4085, term4085.getClass(), "canContainBlock", false);
        setBooleanField(term4085, term4085.getClass(), "canContainInline", false);
        setBooleanField(term4085, term4085.getClass(), "empty", false);
        setBooleanField(term4085, term4085.getClass(), "selfClosing", true);
        setBooleanField(term4085, term4085.getClass(), "preserveWhitespace", true);
        setField(term4071, term4071.getClass(), "tag", term4085);
        setField(term4071, term4071.getClass(), "classNames", term4105);
        setField(term4071, term4071.getClass(), "parentNode", null);
        setField(term4071, term4071.getClass(), "childNodes", term4126);
        setField(term4130, term4130.getClass(), "attributes", term4131);
        setField(term4071, term4071.getClass(), "attributes", term4130);
        setField(term4071, term4071.getClass(), "baseUri", "HzqpegHiRq");
        setIntField(term4071, term4071.getClass(), "siblingIndex", 865208305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clone", argTypes, term4071, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



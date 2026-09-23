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
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Document_outputSettings_11452575334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4376;
     Object term17055;
     Object term16989;

    public Document_outputSettings_11452575334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17072 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term17071 = ((Class) term17072).getDeclaredField((String) "noQuirks");
        ((Field) term17071).setAccessible(true);
        Object enum41 = ((Field) term17071).get((Object) null);
        HashMap term4413 = new HashMap();
        Set<Object> term17288 =  ((Map) term4413).keySet();
        HashSet term4412 = new HashSet((Collection<? extends Object>) term17288);
        ArrayList term4429 = new ArrayList();
        ((ArrayList) term4429).add((Object)null);
        ((ArrayList) term4429).add((Object)null);
        ((ArrayList) term4429).add((Object)null);
        ((ArrayList) term4429).add((Object)null);
        ((ArrayList) term4429).add((Object)null);
        ((ArrayList) term4429).add((Object)null);
        LinkedHashMap term4434 = new LinkedHashMap();
        term4376 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term4377 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term4392 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4433 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4377, term4377.getClass(), "escapeMode", null);
        setField(term4377, term4377.getClass(), "charset", null);
        setField(term4377, term4377.getClass(), "charsetEncoder", null);
        setBooleanField(term4377, term4377.getClass(), "prettyPrint", false);
        setIntField(term4377, term4377.getClass(), "indentAmount", -1275173084);
        setField(term4376, term4376.getClass(), "outputSettings", term4377);
        setField(term4376, term4376.getClass(), "quirksMode", enum41);
        setField(term4392, term4392.getClass(), "tagName", "jwsfVjMoJT");
        setBooleanField(term4392, term4392.getClass(), "isBlock", false);
        setBooleanField(term4392, term4392.getClass(), "formatAsBlock", false);
        setBooleanField(term4392, term4392.getClass(), "canContainBlock", false);
        setBooleanField(term4392, term4392.getClass(), "canContainInline", false);
        setBooleanField(term4392, term4392.getClass(), "empty", false);
        setBooleanField(term4392, term4392.getClass(), "selfClosing", false);
        setBooleanField(term4392, term4392.getClass(), "preserveWhitespace", false);
        setField(term4376, term4376.getClass(), "tag", term4392);
        setField(term4376, term4376.getClass(), "classNames", term4412);
        setField(term4376, term4376.getClass(), "parentNode", null);
        setField(term4376, term4376.getClass(), "childNodes", term4429);
        setField(term4433, term4433.getClass(), "attributes", term4434);
        setField(term4376, term4376.getClass(), "attributes", term4433);
        setField(term4376, term4376.getClass(), "baseUri", "VeDtgDzGAN");
        setIntField(term4376, term4376.getClass(), "siblingIndex", -244121226);
        Class<? extends Object> term17303 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term17302 = ((Class) term17303).getDeclaredField((String) "noQuirks");
        ((Field) term17302).setAccessible(true);
        Object enum42 = ((Field) term17302).get((Object) null);
        HashMap term17064 = new HashMap();
        Set<Object> term17522 =  ((Map) term17064).keySet();
        HashSet term17063 = new HashSet((Collection<? extends Object>) term17522);
        ArrayList term17065 = new ArrayList();
        ((ArrayList) term17065).add((Object)null);
        ((ArrayList) term17065).add((Object)null);
        ((ArrayList) term17065).add((Object)null);
        ((ArrayList) term17065).add((Object)null);
        ((ArrayList) term17065).add((Object)null);
        ((ArrayList) term17065).add((Object)null);
        LinkedHashMap term17068 = new LinkedHashMap();
        term17055 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term17056 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term17060 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term17067 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term17056, term17056.getClass(), "escapeMode", null);
        setField(term17056, term17056.getClass(), "charset", null);
        setField(term17056, term17056.getClass(), "charsetEncoder", null);
        setBooleanField(term17056, term17056.getClass(), "prettyPrint", false);
        setIntField(term17056, term17056.getClass(), "indentAmount", -1275173084);
        setField(term17055, term17055.getClass(), "outputSettings", term17056);
        setField(term17055, term17055.getClass(), "quirksMode", enum42);
        setField(term17060, term17060.getClass(), "tagName", "jwsfVjMoJT");
        setBooleanField(term17060, term17060.getClass(), "isBlock", false);
        setBooleanField(term17060, term17060.getClass(), "formatAsBlock", false);
        setBooleanField(term17060, term17060.getClass(), "canContainBlock", false);
        setBooleanField(term17060, term17060.getClass(), "canContainInline", false);
        setBooleanField(term17060, term17060.getClass(), "empty", false);
        setBooleanField(term17060, term17060.getClass(), "selfClosing", false);
        setBooleanField(term17060, term17060.getClass(), "preserveWhitespace", false);
        setField(term17055, term17055.getClass(), "tag", term17060);
        setField(term17055, term17055.getClass(), "classNames", term17063);
        setField(term17055, term17055.getClass(), "parentNode", null);
        setField(term17055, term17055.getClass(), "childNodes", term17065);
        setField(term17067, term17067.getClass(), "attributes", term17068);
        setField(term17055, term17055.getClass(), "attributes", term17067);
        setField(term17055, term17055.getClass(), "baseUri", "VeDtgDzGAN");
        setIntField(term17055, term17055.getClass(), "siblingIndex", -244121226);
        term16989 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term16989, term16989.getClass(), "escapeMode", null);
        setField(term16989, term16989.getClass(), "charset", null);
        setField(term16989, term16989.getClass(), "charsetEncoder", null);
        setBooleanField(term16989, term16989.getClass(), "prettyPrint", false);
        setIntField(term16989, term16989.getClass(), "indentAmount", -1275173084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "outputSettings", argTypes, term4376, args);
        assertTrue(recursiveEquals(term4376, term17055));
        assertTrue(recursiveEquals(retValue, term16989));
    }

};



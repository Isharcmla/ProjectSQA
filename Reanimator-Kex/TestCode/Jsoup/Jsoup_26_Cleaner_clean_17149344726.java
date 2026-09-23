package org.jsoup.safety;

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
import java.lang.ExceptionInInitializerError;
import static org.jsoup.safety.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Cleaner_clean_17149344726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;
     Object term49;

    public Cleaner_clean_17149344726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term28 = new HashMap();
        Set<Object> term1656 =  ((Map) term28).keySet();
        HashSet term27 = new HashSet((Collection<? extends Object>) term1656);
        HashMap term33 = new HashMap();
        HashMap term38 = new HashMap();
        HashMap term43 = new HashMap();
        term25 = newInstance(Class.forName("org.jsoup.safety.Cleaner"));
        Object term26 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term26, term26.getClass(), "tagNames", term27);
        setField(term26, term26.getClass(), "attributes", term33);
        setField(term26, term26.getClass(), "enforcedAttributes", term38);
        setField(term26, term26.getClass(), "protocols", term43);
        setBooleanField(term26, term26.getClass(), "preserveRelativeLinks", false);
        setField(term25, term25.getClass(), "whitelist", term26);
        Class<? extends Object> term1658 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term1657 = ((Class) term1658).getDeclaredField((String) "quirks");
        ((Field) term1657).setAccessible(true);
        Object enum2 = ((Field) term1657).get((Object) null);
        HashMap term84 = new HashMap();
        Set<Object> term1867 =  ((Map) term84).keySet();
        HashSet term83 = new HashSet((Collection<? extends Object>) term1867);
        ArrayList term98 = new ArrayList();
        ((ArrayList) term98).add((Object)null);
        ((ArrayList) term98).add((Object)null);
        ((ArrayList) term98).add((Object)null);
        ((ArrayList) term98).add((Object)null);
        LinkedHashMap term103 = new LinkedHashMap();
        term49 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term50 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term63 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term102 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term50, term50.getClass(), "escapeMode", null);
        setField(term50, term50.getClass(), "charset", null);
        setField(term50, term50.getClass(), "charsetEncoder", null);
        setBooleanField(term50, term50.getClass(), "prettyPrint", false);
        setIntField(term50, term50.getClass(), "indentAmount", 568599855);
        setField(term49, term49.getClass(), "outputSettings", term50);
        setField(term49, term49.getClass(), "quirksMode", enum2);
        setField(term63, term63.getClass(), "tagName", "PAEBtnZtTD");
        setBooleanField(term63, term63.getClass(), "isBlock", false);
        setBooleanField(term63, term63.getClass(), "formatAsBlock", true);
        setBooleanField(term63, term63.getClass(), "canContainBlock", true);
        setBooleanField(term63, term63.getClass(), "canContainInline", true);
        setBooleanField(term63, term63.getClass(), "empty", true);
        setBooleanField(term63, term63.getClass(), "selfClosing", false);
        setBooleanField(term63, term63.getClass(), "preserveWhitespace", true);
        setField(term49, term49.getClass(), "tag", term63);
        setField(term49, term49.getClass(), "classNames", term83);
        setField(term49, term49.getClass(), "parentNode", null);
        setField(term49, term49.getClass(), "childNodes", term98);
        setField(term102, term102.getClass(), "attributes", term103);
        setField(term49, term49.getClass(), "attributes", term102);
        setField(term49, term49.getClass(), "baseUri", "RMFIsYGgne");
        setIntField(term49, term49.getClass(), "siblingIndex", 1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Cleaner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Document");
        Object[] args = new Object[1];
        args[0] = term49;
        try {
            callMethod(klass, "clean", argTypes, term25, args);
            assertTrue(false);
        }
        catch (ExceptionInInitializerError e) {
        }

    }

};



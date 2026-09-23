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
import java.lang.NoClassDefFoundError;
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

public class Cleaner_isValid_17071088497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term670;
     Object term694;

    public Cleaner_isValid_17071088497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term673 = new HashMap();
        Set<Object> term3804 =  ((Map) term673).keySet();
        HashSet term672 = new HashSet((Collection<? extends Object>) term3804);
        HashMap term678 = new HashMap();
        HashMap term683 = new HashMap();
        HashMap term688 = new HashMap();
        term670 = newInstance(Class.forName("org.jsoup.safety.Cleaner"));
        Object term671 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term671, term671.getClass(), "tagNames", term672);
        setField(term671, term671.getClass(), "attributes", term678);
        setField(term671, term671.getClass(), "enforcedAttributes", term683);
        setField(term671, term671.getClass(), "protocols", term688);
        setBooleanField(term671, term671.getClass(), "preserveRelativeLinks", false);
        setField(term670, term670.getClass(), "whitelist", term671);
        Class<? extends Object> term3806 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term3805 = ((Class) term3806).getDeclaredField((String) "html");
        ((Field) term3805).setAccessible(true);
        Object enum8 = ((Field) term3805).get((Object) null);
        Class<? extends Object> term4055 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term4054 = ((Class) term4055).getDeclaredField((String) "limitedQuirks");
        ((Field) term4054).setAccessible(true);
        Object enum9 = ((Field) term4054).get((Object) null);
        ArrayList term759 = new ArrayList();
        ((ArrayList) term759).add((Object)null);
        ((ArrayList) term759).add((Object)null);
        ((ArrayList) term759).add((Object)null);
        ((ArrayList) term759).add((Object)null);
        LinkedHashMap term764 = new LinkedHashMap();
        term694 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term695 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term737 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term763 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term695, term695.getClass(), "escapeMode", null);
        setField(term695, term695.getClass(), "charset", null);
        setBooleanField(term695, term695.getClass(), "prettyPrint", false);
        setBooleanField(term695, term695.getClass(), "outline", true);
        setIntField(term695, term695.getClass(), "indentAmount", 1484323161);
        setField(term695, term695.getClass(), "syntax", enum8);
        setField(term694, term694.getClass(), "outputSettings", term695);
        setField(term694, term694.getClass(), "quirksMode", enum9);
        setField(term694, term694.getClass(), "location", "SzjVpOQTyS");
        setBooleanField(term694, term694.getClass(), "updateMetaCharset", true);
        setField(term737, term737.getClass(), "tagName", "MjGYSRKTNF");
        setBooleanField(term737, term737.getClass(), "isBlock", false);
        setBooleanField(term737, term737.getClass(), "formatAsBlock", false);
        setBooleanField(term737, term737.getClass(), "canContainBlock", true);
        setBooleanField(term737, term737.getClass(), "canContainInline", true);
        setBooleanField(term737, term737.getClass(), "empty", true);
        setBooleanField(term737, term737.getClass(), "selfClosing", true);
        setBooleanField(term737, term737.getClass(), "preserveWhitespace", true);
        setBooleanField(term737, term737.getClass(), "formList", false);
        setBooleanField(term737, term737.getClass(), "formSubmit", false);
        setField(term694, term694.getClass(), "tag", term737);
        setField(term694, term694.getClass(), "parentNode", null);
        setField(term694, term694.getClass(), "childNodes", term759);
        setField(term763, term763.getClass(), "attributes", term764);
        setField(term694, term694.getClass(), "attributes", term763);
        setField(term694, term694.getClass(), "baseUri", "uuaPigETmJ");
        setIntField(term694, term694.getClass(), "siblingIndex", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Cleaner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Document");
        Object[] args = new Object[1];
        args[0] = term694;
        try {
            callMethod(klass, "isValid", argTypes, term670, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};



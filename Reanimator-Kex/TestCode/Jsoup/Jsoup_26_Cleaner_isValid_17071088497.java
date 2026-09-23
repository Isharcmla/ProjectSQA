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
     Object term388;
     Object term412;

    public Cleaner_isValid_17071088497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term391 = new HashMap();
        Set<Object> term2614 =  ((Map) term391).keySet();
        HashSet term390 = new HashSet((Collection<? extends Object>) term2614);
        HashMap term396 = new HashMap();
        HashMap term401 = new HashMap();
        HashMap term406 = new HashMap();
        term388 = newInstance(Class.forName("org.jsoup.safety.Cleaner"));
        Object term389 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term389, term389.getClass(), "tagNames", term390);
        setField(term389, term389.getClass(), "attributes", term396);
        setField(term389, term389.getClass(), "enforcedAttributes", term401);
        setField(term389, term389.getClass(), "protocols", term406);
        setBooleanField(term389, term389.getClass(), "preserveRelativeLinks", false);
        setField(term388, term388.getClass(), "whitelist", term389);
        Class<? extends Object> term2616 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term2615 = ((Class) term2616).getDeclaredField((String) "limitedQuirks");
        ((Field) term2615).setAccessible(true);
        Object enum4 = ((Field) term2615).get((Object) null);
        HashMap term454 = new HashMap();
        Set<Object> term2846 =  ((Map) term454).keySet();
        HashSet term453 = new HashSet((Collection<? extends Object>) term2846);
        ArrayList term464 = new ArrayList();
        ((ArrayList) term464).add((Object)null);
        ((ArrayList) term464).add((Object)null);
        ((ArrayList) term464).add((Object)null);
        ((ArrayList) term464).add((Object)null);
        LinkedHashMap term469 = new LinkedHashMap();
        term412 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term413 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term433 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term468 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term413, term413.getClass(), "escapeMode", null);
        setField(term413, term413.getClass(), "charset", null);
        setField(term413, term413.getClass(), "charsetEncoder", null);
        setBooleanField(term413, term413.getClass(), "prettyPrint", true);
        setIntField(term413, term413.getClass(), "indentAmount", 1484323161);
        setField(term412, term412.getClass(), "outputSettings", term413);
        setField(term412, term412.getClass(), "quirksMode", enum4);
        setField(term433, term433.getClass(), "tagName", "NRdvgJlhkX");
        setBooleanField(term433, term433.getClass(), "isBlock", false);
        setBooleanField(term433, term433.getClass(), "formatAsBlock", true);
        setBooleanField(term433, term433.getClass(), "canContainBlock", false);
        setBooleanField(term433, term433.getClass(), "canContainInline", false);
        setBooleanField(term433, term433.getClass(), "empty", true);
        setBooleanField(term433, term433.getClass(), "selfClosing", true);
        setBooleanField(term433, term433.getClass(), "preserveWhitespace", false);
        setField(term412, term412.getClass(), "tag", term433);
        setField(term412, term412.getClass(), "classNames", term453);
        setField(term412, term412.getClass(), "parentNode", null);
        setField(term412, term412.getClass(), "childNodes", term464);
        setField(term468, term468.getClass(), "attributes", term469);
        setField(term412, term412.getClass(), "attributes", term468);
        setField(term412, term412.getClass(), "baseUri", "tbcdzjIfER");
        setIntField(term412, term412.getClass(), "siblingIndex", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Cleaner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Document");
        Object[] args = new Object[1];
        args[0] = term412;
        try {
            callMethod(klass, "isValid", argTypes, term388, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};



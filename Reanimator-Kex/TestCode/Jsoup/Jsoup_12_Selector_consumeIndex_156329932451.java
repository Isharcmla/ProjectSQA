package org.jsoup.select;

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
import static org.jsoup.select.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Selector_consumeIndex_156329932451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2040;

    public Selector_consumeIndex_156329932451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2064 = new ArrayList();
        ((ArrayList) term2064).add((Object)null);
        ((ArrayList) term2064).add((Object)null);
        ((ArrayList) term2064).add((Object)null);
        ((ArrayList) term2064).add((Object)null);
        ((ArrayList) term2064).add((Object)null);
        ((ArrayList) term2064).add((Object)null);
        ((ArrayList) term2064).add((Object)null);
        ArrayList term2068 = new ArrayList();
        ((ArrayList) term2068).add((Object)null);
        ((ArrayList) term2068).add((Object)null);
        ((ArrayList) term2068).add((Object)null);
        ((ArrayList) term2068).add((Object)null);
        ((ArrayList) term2068).add((Object)null);
        ((ArrayList) term2068).add((Object)null);
        ArrayList term2072 = new ArrayList();
        ((ArrayList) term2072).add((Object)null);
        HashMap term2079 = new HashMap();
        Set<Object> term8863 =  ((Map) term2079).keySet();
        HashSet term2078 = new HashSet((Collection<? extends Object>) term8863);
        ArrayList term2084 = new ArrayList();
        ((ArrayList) term2084).add((Object)null);
        ((ArrayList) term2084).add((Object)null);
        ((ArrayList) term2084).add((Object)null);
        ((ArrayList) term2084).add((Object)null);
        LinkedHashMap term2089 = new LinkedHashMap();
        LinkedHashMap term2109 = new LinkedHashMap();
        Set<Object> term8874 =  ((Map) term2109).keySet();
        LinkedHashSet term2108 = new LinkedHashSet((Collection<? extends Object>) term8874);
        term2040 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term2041 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2042 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2088 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term2147 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term2042, term2042.getClass(), "tagName", "JdOMfNWgLP");
        setBooleanField(term2042, term2042.getClass(), "knownTag", true);
        setBooleanField(term2042, term2042.getClass(), "isBlock", true);
        setBooleanField(term2042, term2042.getClass(), "formatAsBlock", false);
        setBooleanField(term2042, term2042.getClass(), "canContainBlock", false);
        setBooleanField(term2042, term2042.getClass(), "canContainInline", true);
        setBooleanField(term2042, term2042.getClass(), "optionalClosing", true);
        setBooleanField(term2042, term2042.getClass(), "empty", false);
        setBooleanField(term2042, term2042.getClass(), "selfClosing", true);
        setBooleanField(term2042, term2042.getClass(), "preserveWhitespace", true);
        setField(term2042, term2042.getClass(), "ancestors", term2064);
        setField(term2042, term2042.getClass(), "excludes", term2068);
        setField(term2042, term2042.getClass(), "ignoreEndTags", term2072);
        setBooleanField(term2042, term2042.getClass(), "directDescendant", true);
        setBooleanField(term2042, term2042.getClass(), "limitChildren", true);
        setField(term2041, term2041.getClass(), "tag", term2042);
        setField(term2041, term2041.getClass(), "classNames", term2078);
        setField(term2041, term2041.getClass(), "parentNode", null);
        setField(term2041, term2041.getClass(), "childNodes", term2084);
        setField(term2088, term2088.getClass(), "attributes", term2089);
        setField(term2041, term2041.getClass(), "attributes", term2088);
        setField(term2041, term2041.getClass(), "baseUri", "YfkhviKZwl");
        setIntField(term2041, term2041.getClass(), "siblingIndex", 972867650);
        setField(term2040, term2040.getClass(), "root", term2041);
        setField(term2040, term2040.getClass(), "elements", term2108);
        setField(term2040, term2040.getClass(), "query", "qxhOsmyyjm");
        setField(term2147, term2147.getClass(), "queue", null);
        setIntField(term2147, term2147.getClass(), "pos", 0);
        setField(term2040, term2040.getClass(), "tq", term2147);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeIndex", argTypes, term2040, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



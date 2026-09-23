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
import java.lang.StringIndexOutOfBoundsException;
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

public class Selector_byId_87010500143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term857;

    public Selector_byId_87010500143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term881 = new ArrayList();
        ((ArrayList) term881).add((Object)null);
        ((ArrayList) term881).add((Object)null);
        ((ArrayList) term881).add((Object)null);
        ((ArrayList) term881).add((Object)null);
        ((ArrayList) term881).add((Object)null);
        ((ArrayList) term881).add((Object)null);
        ArrayList term885 = new ArrayList();
        ArrayList term889 = new ArrayList();
        ((ArrayList) term889).add((Object)null);
        ((ArrayList) term889).add((Object)null);
        ((ArrayList) term889).add((Object)null);
        ((ArrayList) term889).add((Object)null);
        HashMap term896 = new HashMap();
        Set<Object> term6584 =  ((Map) term896).keySet();
        HashSet term895 = new HashSet((Collection<? extends Object>) term6584);
        ArrayList term902 = new ArrayList();
        ((ArrayList) term902).add((Object)null);
        ((ArrayList) term902).add((Object)null);
        ((ArrayList) term902).add((Object)null);
        ((ArrayList) term902).add((Object)null);
        ((ArrayList) term902).add((Object)null);
        ((ArrayList) term902).add((Object)null);
        ((ArrayList) term902).add((Object)null);
        ((ArrayList) term902).add((Object)null);
        ((ArrayList) term902).add((Object)null);
        LinkedHashMap term907 = new LinkedHashMap();
        LinkedHashMap term927 = new LinkedHashMap();
        Set<Object> term6595 =  ((Map) term927).keySet();
        LinkedHashSet term926 = new LinkedHashSet((Collection<? extends Object>) term6595);
        term857 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term858 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term859 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term906 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term957 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term859, term859.getClass(), "tagName", "TweMFhxNdj");
        setBooleanField(term859, term859.getClass(), "knownTag", false);
        setBooleanField(term859, term859.getClass(), "isBlock", false);
        setBooleanField(term859, term859.getClass(), "formatAsBlock", true);
        setBooleanField(term859, term859.getClass(), "canContainBlock", true);
        setBooleanField(term859, term859.getClass(), "canContainInline", false);
        setBooleanField(term859, term859.getClass(), "optionalClosing", true);
        setBooleanField(term859, term859.getClass(), "empty", true);
        setBooleanField(term859, term859.getClass(), "selfClosing", false);
        setBooleanField(term859, term859.getClass(), "preserveWhitespace", false);
        setField(term859, term859.getClass(), "ancestors", term881);
        setField(term859, term859.getClass(), "excludes", term885);
        setField(term859, term859.getClass(), "ignoreEndTags", term889);
        setBooleanField(term859, term859.getClass(), "directDescendant", false);
        setBooleanField(term859, term859.getClass(), "limitChildren", true);
        setField(term858, term858.getClass(), "tag", term859);
        setField(term858, term858.getClass(), "classNames", term895);
        setField(term858, term858.getClass(), "parentNode", null);
        setField(term858, term858.getClass(), "childNodes", term902);
        setField(term906, term906.getClass(), "attributes", term907);
        setField(term858, term858.getClass(), "attributes", term906);
        setField(term858, term858.getClass(), "baseUri", "urCiQnUFBM");
        setIntField(term858, term858.getClass(), "siblingIndex", -1087774327);
        setField(term857, term857.getClass(), "root", term858);
        setField(term857, term857.getClass(), "elements", term926);
        setField(term857, term857.getClass(), "query", "THZSpzBRYP");
        setField(term957, term957.getClass(), "queue", "ZfBIVGBQOE");
        setIntField(term957, term957.getClass(), "pos", 679763016);
        setField(term857, term857.getClass(), "tq", term957);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "byId", argTypes, term857, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};



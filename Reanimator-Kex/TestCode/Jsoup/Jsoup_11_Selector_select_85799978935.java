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

public class Selector_select_85799978935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401;

    public Selector_select_85799978935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term425 = new ArrayList();
        ((ArrayList) term425).add((Object)null);
        ((ArrayList) term425).add((Object)null);
        ((ArrayList) term425).add((Object)null);
        ((ArrayList) term425).add((Object)null);
        ((ArrayList) term425).add((Object)null);
        ((ArrayList) term425).add((Object)null);
        ((ArrayList) term425).add((Object)null);
        ((ArrayList) term425).add((Object)null);
        ((ArrayList) term425).add((Object)null);
        ArrayList term429 = new ArrayList();
        ((ArrayList) term429).add((Object)null);
        ((ArrayList) term429).add((Object)null);
        ((ArrayList) term429).add((Object)null);
        ((ArrayList) term429).add((Object)null);
        ((ArrayList) term429).add((Object)null);
        ((ArrayList) term429).add((Object)null);
        ((ArrayList) term429).add((Object)null);
        ArrayList term433 = new ArrayList();
        ((ArrayList) term433).add((Object)null);
        HashMap term440 = new HashMap();
        Set<Object> term4927 =  ((Map) term440).keySet();
        HashSet term439 = new HashSet((Collection<? extends Object>) term4927);
        ArrayList term446 = new ArrayList();
        ((ArrayList) term446).add((Object)null);
        ((ArrayList) term446).add((Object)null);
        ((ArrayList) term446).add((Object)null);
        ((ArrayList) term446).add((Object)null);
        LinkedHashMap term451 = new LinkedHashMap();
        LinkedHashMap term471 = new LinkedHashMap();
        Set<Object> term4938 =  ((Map) term471).keySet();
        LinkedHashSet term470 = new LinkedHashSet((Collection<? extends Object>) term4938);
        term401 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term402 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term403 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term450 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term505 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term403, term403.getClass(), "tagName", "SbAoxhfrkn");
        setBooleanField(term403, term403.getClass(), "knownTag", false);
        setBooleanField(term403, term403.getClass(), "isBlock", true);
        setBooleanField(term403, term403.getClass(), "formatAsBlock", true);
        setBooleanField(term403, term403.getClass(), "canContainBlock", false);
        setBooleanField(term403, term403.getClass(), "canContainInline", true);
        setBooleanField(term403, term403.getClass(), "optionalClosing", true);
        setBooleanField(term403, term403.getClass(), "empty", true);
        setBooleanField(term403, term403.getClass(), "selfClosing", true);
        setBooleanField(term403, term403.getClass(), "preserveWhitespace", true);
        setField(term403, term403.getClass(), "ancestors", term425);
        setField(term403, term403.getClass(), "excludes", term429);
        setField(term403, term403.getClass(), "ignoreEndTags", term433);
        setBooleanField(term403, term403.getClass(), "directDescendant", true);
        setBooleanField(term403, term403.getClass(), "limitChildren", true);
        setField(term402, term402.getClass(), "tag", term403);
        setField(term402, term402.getClass(), "classNames", term439);
        setField(term402, term402.getClass(), "parentNode", null);
        setField(term402, term402.getClass(), "childNodes", term446);
        setField(term450, term450.getClass(), "attributes", term451);
        setField(term402, term402.getClass(), "attributes", term450);
        setField(term402, term402.getClass(), "baseUri", "LvtrsXUliU");
        setIntField(term402, term402.getClass(), "siblingIndex", 1484323161);
        setField(term401, term401.getClass(), "root", term402);
        setField(term401, term401.getClass(), "elements", term470);
        setField(term401, term401.getClass(), "query", "jiKYgYHqIS");
        setField(term505, term505.getClass(), "queue", "DfISiziTgG");
        setIntField(term505, term505.getClass(), "pos", -1339778481);
        setField(term401, term401.getClass(), "tq", term505);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "select", argTypes, term401, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};



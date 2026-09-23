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
import static org.jsoup.select.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.select.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class Selector_allElements_1911623665424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368057;
     Object term383303;
     Object term383292;

    public Selector_allElements_1911623665424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term368161 = new ArrayList();
        term368057 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term368109 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term368109, term368109.getClass(), "childNodes", term368161);
        setField(term368057, term368057.getClass(), "root", term368109);
        ArrayList term383305 = new ArrayList();
        term383303 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term383304 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term383304, term383304.getClass(), "tag", null);
        setField(term383304, term383304.getClass(), "classNames", null);
        setField(term383304, term383304.getClass(), "parentNode", null);
        setField(term383304, term383304.getClass(), "childNodes", term383305);
        setField(term383304, term383304.getClass(), "attributes", null);
        setField(term383304, term383304.getClass(), "baseUri", null);
        setIntField(term383304, term383304.getClass(), "siblingIndex", 0);
        setField(term383303, term383303.getClass(), "root", term383304);
        setField(term383303, term383303.getClass(), "elements", null);
        setField(term383303, term383303.getClass(), "query", null);
        setField(term383303, term383303.getClass(), "tq", null);
        ArrayList term383296 = new ArrayList();
        Object term383295 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term383295, term383295.getClass(), "tag", null);
        setField(term383295, term383295.getClass(), "classNames", null);
        setField(term383295, term383295.getClass(), "parentNode", null);
        setField(term383295, term383295.getClass(), "childNodes", term383296);
        setField(term383295, term383295.getClass(), "attributes", null);
        setField(term383295, term383295.getClass(), "baseUri", null);
        setIntField(term383295, term383295.getClass(), "siblingIndex", 0);
        ArrayList term383293 = new ArrayList();
        ((ArrayList) term383293).add(term383295);
        term383292 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term383292, term383292.getClass(), "contents", term383293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "allElements", argTypes, term368057, args);
        assertTrue(recursiveEquals(term368057, term383303));
        assertTrue(recursiveEquals(retValue, term383292));
    }

};



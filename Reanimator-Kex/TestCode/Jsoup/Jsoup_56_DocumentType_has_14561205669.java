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
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedHashMap;

public class DocumentType_has_14561205669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term750;
     Object term2772;

    public DocumentType_has_14561205669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term751 = new ArrayList();
        ((ArrayList) term751).add((Object)null);
        ((ArrayList) term751).add((Object)null);
        ((ArrayList) term751).add((Object)null);
        ((ArrayList) term751).add((Object)null);
        LinkedHashMap term756 = new LinkedHashMap();
        term750 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        Object term755 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term750, term750.getClass(), "parentNode", null);
        setField(term750, term750.getClass(), "childNodes", term751);
        setField(term755, term755.getClass(), "attributes", term756);
        setField(term750, term750.getClass(), "attributes", term755);
        setField(term750, term750.getClass(), "baseUri", "pCTimMblYc");
        setIntField(term750, term750.getClass(), "siblingIndex", -2038273078);
        ArrayList term2773 = new ArrayList();
        ((ArrayList) term2773).add((Object)null);
        ((ArrayList) term2773).add((Object)null);
        ((ArrayList) term2773).add((Object)null);
        ((ArrayList) term2773).add((Object)null);
        LinkedHashMap term2776 = new LinkedHashMap();
        term2772 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        Object term2775 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2772, term2772.getClass(), "parentNode", null);
        setField(term2772, term2772.getClass(), "childNodes", term2773);
        setField(term2775, term2775.getClass(), "attributes", term2776);
        setField(term2772, term2772.getClass(), "attributes", term2775);
        setField(term2772, term2772.getClass(), "baseUri", "pCTimMblYc");
        setIntField(term2772, term2772.getClass(), "siblingIndex", -2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.DocumentType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hNxWaHcfhY";
        Object retValue = callMethod(klass, "has", argTypes, term750, args);
        assertTrue(recursiveEquals(term750, term2772));
        assertTrue(recursiveEquals(retValue, false));
    }

};



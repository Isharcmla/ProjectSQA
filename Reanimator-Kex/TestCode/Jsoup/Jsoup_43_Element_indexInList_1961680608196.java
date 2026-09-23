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
import java.lang.Object;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_indexInList_1961680608196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43442;
     Object term43638;

    public Element_indexInList_1961680608196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43442 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term43500 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term43546 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term43442, term43442.getClass(), "childNodes", null);
        setField(term43500, term43500.getClass(), "attributes", null);
        setField(term43442, term43442.getClass(), "attributes", term43500);
        setField(term43546, term43546.getClass(), "tagName", "");
        setField(term43442, term43442.getClass(), "tag", term43546);
        ArrayList term43768 = new ArrayList();
        LinkedHashMap term43886 = new LinkedHashMap();
        Object term43716 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term43826 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term43932 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term43716, term43716.getClass(), "childNodes", term43768);
        setField(term43826, term43826.getClass(), "attributes", term43886);
        setField(term43716, term43716.getClass(), "attributes", term43826);
        setField(term43932, term43932.getClass(), "tagName", "byte[]");
        setField(term43716, term43716.getClass(), "tag", term43932);
        term43638 = new LinkedList();
        ((LinkedList) term43638).add(term43716);
        ((LinkedList) term43638).add("byte");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term43442;
        args[1] = term43638;
        callMethod(klass, "indexInList", argTypes, null, args);
    }

};



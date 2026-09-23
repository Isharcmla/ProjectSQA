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

public class Element_indexInList_1961680608193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42249;
     Object term42361;

    public Element_indexInList_1961680608193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42249 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term42307 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term42249, term42249.getClass(), "childNodes", null);
        setField(term42307, term42307.getClass(), "attributes", null);
        setField(term42249, term42249.getClass(), "attributes", term42307);
        ArrayList term42495 = new ArrayList();
        LinkedHashMap term42613 = new LinkedHashMap();
        Object term42443 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term42553 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term42443, term42443.getClass(), "childNodes", term42495);
        setField(term42553, term42553.getClass(), "attributes", term42613);
        setField(term42443, term42443.getClass(), "attributes", term42553);
        Object term42651 = newInstance(Class.forName("java.lang.Object"));
        term42361 = new LinkedList();
        ((LinkedList) term42361).add(term42443);
        ((LinkedList) term42361).add(term42651);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term42249;
        args[1] = term42361;
        callMethod(klass, "indexInList", argTypes, null, args);
    }

};



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
import java.util.LinkedHashMap;
import java.util.ArrayList;

public class Element_getElementById_402338892173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37888;

    public Element_getElementById_402338892173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term38006 = new LinkedHashMap();
        ((LinkedHashMap) term38006).put((Object)null, (Object)null);
        ((LinkedHashMap) term38006).put((Object)null, (Object)null);
        ((LinkedHashMap) term38006).put((Object)null, (Object)null);
        ((LinkedHashMap) term38006).put((Object)null, (Object)null);
        ArrayList term38162 = new ArrayList();
        ((ArrayList) term38162).add((Object)null);
        ((ArrayList) term38162).add((Object)null);
        ((ArrayList) term38162).add((Object)null);
        ((ArrayList) term38162).add((Object)null);
        term37888 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term37946 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term37946, term37946.getClass(), "attributes", term38006);
        setField(term37888, term37888.getClass(), "attributes", term37946);
        setField(term37888, term37888.getClass(), "childNodes", term38162);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ";
        callMethod(klass, "getElementById", argTypes, term37888, args);
    }

};



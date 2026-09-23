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
import java.util.HashSet;
import java.util.ArrayList;
import java.util.HashMap;

public class Element_getElementsByClass_1506017604192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47096;

    public Element_getElementsByClass_1506017604192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term47144 = new HashSet();
        HashMap term47192 = new HashMap();
        ArrayList term47348 = new ArrayList();
        ((ArrayList) term47348).add(term47192);
        term47096 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term47096, term47096.getClass(), "classNames", term47144);
        setField(term47096, term47096.getClass(), "childNodes", term47348);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ";
        callMethod(klass, "getElementsByClass", argTypes, term47096, args);
    }

};



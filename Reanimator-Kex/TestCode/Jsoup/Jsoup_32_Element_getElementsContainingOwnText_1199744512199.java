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
import java.util.ArrayList;
import java.lang.Object;

public class Element_getElementsContainingOwnText_1199744512199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51315;

    public Element_getElementsContainingOwnText_1199744512199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term51087 = (char[]) newCharArray(0);
        ArrayList term51367 = new ArrayList();
        ((ArrayList) term51367).add((Object)null);
        ((ArrayList) term51367).add((Object)null);
        ((ArrayList) term51367).add((Object)null);
        ((ArrayList) term51367).add((Object)null);
        ((ArrayList) term51367).add((Object)null);
        ((ArrayList) term51367).add((Object)null);
        ((ArrayList) term51367).add(term51087);
        ((ArrayList) term51367).add((Object)null);
        ((ArrayList) term51367).add((Object)null);
        ((ArrayList) term51367).add((Object)null);
        ((ArrayList) term51367).add((Object)null);
        ((ArrayList) term51367).add((Object)null);
        ((ArrayList) term51367).add((Object)null);
        ((ArrayList) term51367).add((Object)null);
        ((ArrayList) term51367).add((Object)null);
        term51315 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term51315, term51315.getClass(), "childNodes", term51367);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        callMethod(klass, "getElementsContainingOwnText", argTypes, term51315, args);
    }

};



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

public class Element_children_1937405814186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40295;

    public Element_children_1937405814186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term40399 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        ArrayList term40347 = new ArrayList();
        ((ArrayList) term40347).add((Object)null);
        ((ArrayList) term40347).add(term40399);
        ((ArrayList) term40347).add((Object)null);
        ((ArrayList) term40347).add((Object)null);
        ((ArrayList) term40347).add((Object)null);
        ((ArrayList) term40347).add((Object)null);
        ((ArrayList) term40347).add((Object)null);
        ((ArrayList) term40347).add((Object)null);
        ((ArrayList) term40347).add((Object)null);
        ((ArrayList) term40347).add((Object)null);
        term40295 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term40295, term40295.getClass(), "childNodes", term40347);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "children", argTypes, term40295, args);
    }

};



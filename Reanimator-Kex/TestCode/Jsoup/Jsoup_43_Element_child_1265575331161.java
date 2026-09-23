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

public class Element_child_1265575331161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33644;

    public Element_child_1265575331161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term33748 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        ArrayList term33696 = new ArrayList();
        ((ArrayList) term33696).add((Object)null);
        ((ArrayList) term33696).add(term33748);
        ((ArrayList) term33696).add((Object)null);
        ((ArrayList) term33696).add((Object)null);
        ((ArrayList) term33696).add((Object)null);
        ((ArrayList) term33696).add((Object)null);
        ((ArrayList) term33696).add((Object)null);
        ((ArrayList) term33696).add((Object)null);
        ((ArrayList) term33696).add((Object)null);
        ((ArrayList) term33696).add((Object)null);
        term33644 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term33644, term33644.getClass(), "childNodes", term33696);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "child", argTypes, term33644, args);
    }

};



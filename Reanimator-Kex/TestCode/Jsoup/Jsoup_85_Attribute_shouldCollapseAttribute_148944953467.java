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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Attribute_shouldCollapseAttribute_148944953467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141126;

    public Attribute_shouldCollapseAttribute_148944953467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term141920 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term141919 = ((Class) term141920).getDeclaredField((String) "xml");
        ((Field) term141919).setAccessible(true);
        Object enum40 = ((Field) term141919).get((Object) null);
        term141126 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term141126, term141126.getClass(), "syntax", enum40);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "";
        args[2] = term141126;
        try {
            callMethod(klass, "shouldCollapseAttribute", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



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
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;

public class Attribute_html_247522699125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163264;
     Object term163348;

    public Attribute_html_247522699125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163264 = new StringBuilder();
        Class<? extends Object> term164006 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term164005 = ((Class) term164006).getDeclaredField((String) "html");
        ((Field) term164005).setAccessible(true);
        Object enum58 = ((Field) term164005).get((Object) null);
        term163348 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term163348, term163348.getClass(), "syntax", enum58);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Appendable");
        argTypes[3] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = "";
        args[2] = term163264;
        args[3] = term163348;
        try {
            callMethod(klass, "html", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



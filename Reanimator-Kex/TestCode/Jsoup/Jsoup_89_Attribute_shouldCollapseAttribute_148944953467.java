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
import java.lang.String;
import java.lang.Object;

public class Attribute_shouldCollapseAttribute_148944953467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140161;
     Object term141214;

    public Attribute_shouldCollapseAttribute_148944953467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term141222 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term141221 = ((Class) term141222).getDeclaredField((String) "xml");
        ((Field) term141221).setAccessible(true);
        Object enum37 = ((Field) term141221).get((Object) null);
        term140161 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term140161, term140161.getClass(), "syntax", enum37);
        Class<? extends Object> term141468 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term141467 = ((Class) term141468).getDeclaredField((String) "xml");
        ((Field) term141467).setAccessible(true);
        Object enum38 = ((Field) term141467).get((Object) null);
        term141214 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term141214, term141214.getClass(), "escapeMode", null);
        setField(term141214, term141214.getClass(), "charset", null);
        setField(term141214, term141214.getClass(), "encoderThreadLocal", null);
        setField(term141214, term141214.getClass(), "coreCharset", null);
        setBooleanField(term141214, term141214.getClass(), "prettyPrint", false);
        setBooleanField(term141214, term141214.getClass(), "outline", false);
        setIntField(term141214, term141214.getClass(), "indentAmount", 0);
        setField(term141214, term141214.getClass(), "syntax", enum38);
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
        args[1] = "                                                                                                                                                                                                                                                                ";
        args[2] = term140161;
        Object retValue = callMethod(klass, "shouldCollapseAttribute", argTypes, null, args);
        assertTrue(recursiveEquals(term140161, "                                                                                                                                                                                                                                                                "));
        assertTrue(recursiveEquals(retValue, false));
    }

};



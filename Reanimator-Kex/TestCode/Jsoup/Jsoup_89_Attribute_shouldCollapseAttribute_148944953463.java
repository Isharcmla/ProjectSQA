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

public class Attribute_shouldCollapseAttribute_148944953463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138564;
     Object term139109;

    public Attribute_shouldCollapseAttribute_148944953463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term139115 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term139114 = ((Class) term139115).getDeclaredField((String) "html");
        ((Field) term139114).setAccessible(true);
        Object enum34 = ((Field) term139114).get((Object) null);
        term138564 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term138564, term138564.getClass(), "syntax", enum34);
        Class<? extends Object> term139364 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term139363 = ((Class) term139364).getDeclaredField((String) "html");
        ((Field) term139363).setAccessible(true);
        Object enum35 = ((Field) term139363).get((Object) null);
        term139109 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term139109, term139109.getClass(), "escapeMode", null);
        setField(term139109, term139109.getClass(), "charset", null);
        setField(term139109, term139109.getClass(), "encoderThreadLocal", null);
        setField(term139109, term139109.getClass(), "coreCharset", null);
        setBooleanField(term139109, term139109.getClass(), "prettyPrint", false);
        setBooleanField(term139109, term139109.getClass(), "outline", false);
        setIntField(term139109, term139109.getClass(), "indentAmount", 0);
        setField(term139109, term139109.getClass(), "syntax", enum35);
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
        args[1] = null;
        args[2] = term138564;
        Object retValue = callMethod(klass, "shouldCollapseAttribute", argTypes, null, args);
        assertTrue(recursiveEquals(term138564, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};



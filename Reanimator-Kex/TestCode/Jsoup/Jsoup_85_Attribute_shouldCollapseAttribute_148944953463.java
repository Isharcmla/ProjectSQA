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
     Object term139598;
     Object term140137;

    public Attribute_shouldCollapseAttribute_148944953463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term140143 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term140142 = ((Class) term140143).getDeclaredField((String) "xml");
        ((Field) term140142).setAccessible(true);
        Object enum37 = ((Field) term140142).get((Object) null);
        term139598 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term139598, term139598.getClass(), "syntax", enum37);
        Class<? extends Object> term140389 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term140388 = ((Class) term140389).getDeclaredField((String) "xml");
        ((Field) term140388).setAccessible(true);
        Object enum38 = ((Field) term140388).get((Object) null);
        term140137 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term140137, term140137.getClass(), "escapeMode", null);
        setField(term140137, term140137.getClass(), "charset", null);
        setField(term140137, term140137.getClass(), "encoderThreadLocal", null);
        setField(term140137, term140137.getClass(), "coreCharset", null);
        setBooleanField(term140137, term140137.getClass(), "prettyPrint", false);
        setBooleanField(term140137, term140137.getClass(), "outline", false);
        setIntField(term140137, term140137.getClass(), "indentAmount", 0);
        setField(term140137, term140137.getClass(), "syntax", enum38);
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
        args[2] = term139598;
        Object retValue = callMethod(klass, "shouldCollapseAttribute", argTypes, null, args);
        assertTrue(recursiveEquals(term139598, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};



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

public class Attribute_shouldCollapseAttribute_148944953464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144016;
     Object term144638;

    public Attribute_shouldCollapseAttribute_148944953464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term144644 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term144643 = ((Class) term144644).getDeclaredField((String) "xml");
        ((Field) term144643).setAccessible(true);
        Object enum40 = ((Field) term144643).get((Object) null);
        term144016 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term144016, term144016.getClass(), "syntax", enum40);
        Class<? extends Object> term144890 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term144889 = ((Class) term144890).getDeclaredField((String) "html");
        ((Field) term144889).setAccessible(true);
        Object enum41 = ((Field) term144889).get((Object) null);
        term144638 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term144638, term144638.getClass(), "escapeMode", null);
        setField(term144638, term144638.getClass(), "charset", null);
        setField(term144638, term144638.getClass(), "encoderThreadLocal", null);
        setField(term144638, term144638.getClass(), "coreCharset", null);
        setBooleanField(term144638, term144638.getClass(), "prettyPrint", false);
        setBooleanField(term144638, term144638.getClass(), "outline", false);
        setIntField(term144638, term144638.getClass(), "indentAmount", 0);
        setField(term144638, term144638.getClass(), "syntax", enum41);
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
        args[2] = term144016;
        Object retValue = callMethod(klass, "shouldCollapseAttribute", argTypes, null, args);
        assertTrue(recursiveEquals(term144016, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};



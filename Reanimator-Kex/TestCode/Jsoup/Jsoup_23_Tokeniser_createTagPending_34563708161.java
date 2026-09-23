package org.jsoup.parser;

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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class Tokeniser_createTagPending_34563708161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80755;
     Object term81052;
     Object term81033;

    public Tokeniser_createTagPending_34563708161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80755 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Class<? extends Object> term81059 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term81058 = ((Class) term81059).getDeclaredField((String) "StartTag");
        ((Field) term81058).setAccessible(true);
        Object enum274 = ((Field) term81058).get((Object) null);
        term81052 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term81053 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term81054 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term81052, term81052.getClass(), "reader", null);
        setField(term81052, term81052.getClass(), "errors", null);
        setField(term81052, term81052.getClass(), "state", null);
        setField(term81052, term81052.getClass(), "emitPending", null);
        setBooleanField(term81052, term81052.getClass(), "isEmitPending", false);
        setField(term81052, term81052.getClass(), "charBuffer", null);
        setField(term81052, term81052.getClass(), "dataBuffer", null);
        setField(term81053, term81053.getClass(), "tagName", null);
        setField(term81053, term81053.getClass(), "pendingAttributeName", null);
        setField(term81053, term81053.getClass(), "pendingAttributeValue", null);
        setBooleanField(term81053, term81053.getClass(), "selfClosing", false);
        setField(term81054, term81054.getClass(), "attributes", null);
        setField(term81053, term81053.getClass(), "attributes", term81054);
        setField(term81053, term81053.getClass(), "type", enum274);
        setField(term81052, term81052.getClass(), "tagPending", term81053);
        setField(term81052, term81052.getClass(), "doctypePending", null);
        setField(term81052, term81052.getClass(), "commentPending", null);
        setField(term81052, term81052.getClass(), "lastStartTag", null);
        setBooleanField(term81052, term81052.getClass(), "selfClosingFlagAcknowledged", false);
        Class<? extends Object> term81250 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term81249 = ((Class) term81250).getDeclaredField((String) "StartTag");
        ((Field) term81249).setAccessible(true);
        Object enum275 = ((Field) term81249).get((Object) null);
        term81033 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term81035 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term81033, term81033.getClass(), "tagName", null);
        setField(term81033, term81033.getClass(), "pendingAttributeName", null);
        setField(term81033, term81033.getClass(), "pendingAttributeValue", null);
        setBooleanField(term81033, term81033.getClass(), "selfClosing", false);
        setField(term81035, term81035.getClass(), "attributes", null);
        setField(term81033, term81033.getClass(), "attributes", term81035);
        setField(term81033, term81033.getClass(), "type", enum275);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = true;
        Object retValue = callMethod(klass, "createTagPending", argTypes, term80755, args);
        assertTrue(recursiveEquals(term80755, term81052));
        assertTrue(recursiveEquals(retValue, term81033));
    }

};



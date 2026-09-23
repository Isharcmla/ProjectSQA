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

public class Tokeniser_emitTagPending_852254826171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257341;
     Object term257844;

    public Tokeniser_emitTagPending_852254826171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term257851 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term257850 = ((Class) term257851).getDeclaredField((String) "EndTag");
        ((Field) term257850).setAccessible(true);
        Object enum826 = ((Field) term257850).get((Object) null);
        term257341 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term257405 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term257571 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term257405, term257405.getClass(), "pendingAttributeName", null);
        setField(term257405, term257405.getClass(), "type", enum826);
        setField(term257405, term257405.getClass(), "attributes", term257571);
        setField(term257341, term257341.getClass(), "tagPending", term257405);
        setBooleanField(term257341, term257341.getClass(), "isEmitPending", false);
        setField(term257341, term257341.getClass(), "emitPending", null);
        Class<? extends Object> term258036 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term258035 = ((Class) term258036).getDeclaredField((String) "EndTag");
        ((Field) term258035).setAccessible(true);
        Object enum827 = ((Field) term258035).get((Object) null);
        term257844 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term257845 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term257846 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term257844, term257844.getClass(), "reader", null);
        setBooleanField(term257844, term257844.getClass(), "trackErrors", false);
        setField(term257844, term257844.getClass(), "errors", null);
        setField(term257844, term257844.getClass(), "state", null);
        setField(term257845, term257845.getClass(), "tagName", null);
        setField(term257845, term257845.getClass(), "pendingAttributeName", null);
        setField(term257845, term257845.getClass(), "pendingAttributeValue", null);
        setBooleanField(term257845, term257845.getClass(), "selfClosing", false);
        setField(term257846, term257846.getClass(), "attributes", null);
        setField(term257845, term257845.getClass(), "attributes", term257846);
        setField(term257845, term257845.getClass(), "type", enum827);
        setField(term257844, term257844.getClass(), "emitPending", term257845);
        setBooleanField(term257844, term257844.getClass(), "isEmitPending", true);
        setField(term257844, term257844.getClass(), "charBuffer", null);
        setField(term257844, term257844.getClass(), "dataBuffer", null);
        setField(term257844, term257844.getClass(), "tagPending", term257845);
        setField(term257844, term257844.getClass(), "doctypePending", null);
        setField(term257844, term257844.getClass(), "commentPending", null);
        setField(term257844, term257844.getClass(), "lastStartTag", null);
        setBooleanField(term257844, term257844.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term257341, args);
        assertTrue(recursiveEquals(term257341, term257844));
    }

};



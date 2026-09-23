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

public class Tokeniser_emit_1272425389101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203229;
     Object term203367;
     Object term203982;
     Object term203987;

    public Tokeniser_emit_1272425389101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term203229 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term203299 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setBooleanField(term203229, term203229.getClass(), "isEmitPending", false);
        setField(term203229, term203229.getClass(), "emitPending", term203299);
        Class<? extends Object> term203992 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term203991 = ((Class) term203992).getDeclaredField((String) "StartTag");
        ((Field) term203991).setAccessible(true);
        Object enum769 = ((Field) term203991).get((Object) null);
        term203367 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term203367, term203367.getClass(), "type", enum769);
        Class<? extends Object> term204183 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term204182 = ((Class) term204183).getDeclaredField((String) "StartTag");
        ((Field) term204182).setAccessible(true);
        Object enum770 = ((Field) term204182).get((Object) null);
        term203982 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term203983 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term203982, term203982.getClass(), "reader", null);
        setBooleanField(term203982, term203982.getClass(), "trackErrors", false);
        setField(term203982, term203982.getClass(), "errors", null);
        setField(term203982, term203982.getClass(), "state", null);
        setField(term203983, term203983.getClass(), "tagName", null);
        setField(term203983, term203983.getClass(), "pendingAttributeName", null);
        setField(term203983, term203983.getClass(), "pendingAttributeValue", null);
        setBooleanField(term203983, term203983.getClass(), "selfClosing", false);
        setField(term203983, term203983.getClass(), "attributes", null);
        setField(term203983, term203983.getClass(), "type", enum770);
        setField(term203982, term203982.getClass(), "emitPending", term203983);
        setBooleanField(term203982, term203982.getClass(), "isEmitPending", true);
        setField(term203982, term203982.getClass(), "charBuffer", null);
        setField(term203982, term203982.getClass(), "dataBuffer", null);
        setField(term203982, term203982.getClass(), "tagPending", null);
        setField(term203982, term203982.getClass(), "doctypePending", null);
        setField(term203982, term203982.getClass(), "commentPending", null);
        setField(term203982, term203982.getClass(), "lastStartTag", term203983);
        setBooleanField(term203982, term203982.getClass(), "selfClosingFlagAcknowledged", false);
        Class<? extends Object> term204374 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term204373 = ((Class) term204374).getDeclaredField((String) "StartTag");
        ((Field) term204373).setAccessible(true);
        Object enum771 = ((Field) term204373).get((Object) null);
        term203987 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term203987, term203987.getClass(), "tagName", null);
        setField(term203987, term203987.getClass(), "pendingAttributeName", null);
        setField(term203987, term203987.getClass(), "pendingAttributeValue", null);
        setBooleanField(term203987, term203987.getClass(), "selfClosing", false);
        setField(term203987, term203987.getClass(), "attributes", null);
        setField(term203987, term203987.getClass(), "type", enum771);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term203367;
        callMethod(klass, "emit", argTypes, term203229, args);
        assertTrue(recursiveEquals(term203229, term203982));
        assertTrue(recursiveEquals(term203367, term203987));
    }

};



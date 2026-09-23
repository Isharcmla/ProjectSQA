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

public class Tokeniser_emitTagPending_852254826147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233062;
     Object term234046;

    public Tokeniser_emitTagPending_852254826147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term234052 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term234051 = ((Class) term234052).getDeclaredField((String) "StartTag");
        ((Field) term234051).setAccessible(true);
        Object enum806 = ((Field) term234051).get((Object) null);
        term233062 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term233130 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term233296 = newInstance(Class.forName("org.jsoup.parser.Token$EOF"));
        setField(term233130, term233130.getClass(), "pendingAttributeName", null);
        setField(term233130, term233130.getClass(), "type", enum806);
        setBooleanField(term233130, term233130.getClass(), "selfClosing", true);
        setField(term233062, term233062.getClass(), "tagPending", term233130);
        setBooleanField(term233062, term233062.getClass(), "isEmitPending", false);
        setField(term233062, term233062.getClass(), "emitPending", term233296);
        setField(term233062, term233062.getClass(), "lastStartTag", null);
        Class<? extends Object> term234243 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term234242 = ((Class) term234243).getDeclaredField((String) "StartTag");
        ((Field) term234242).setAccessible(true);
        Object enum807 = ((Field) term234242).get((Object) null);
        term234046 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term234047 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term234046, term234046.getClass(), "reader", null);
        setBooleanField(term234046, term234046.getClass(), "trackErrors", false);
        setField(term234046, term234046.getClass(), "errors", null);
        setField(term234046, term234046.getClass(), "state", null);
        setField(term234047, term234047.getClass(), "tagName", null);
        setField(term234047, term234047.getClass(), "pendingAttributeName", null);
        setField(term234047, term234047.getClass(), "pendingAttributeValue", null);
        setBooleanField(term234047, term234047.getClass(), "selfClosing", true);
        setField(term234047, term234047.getClass(), "attributes", null);
        setField(term234047, term234047.getClass(), "type", enum807);
        setField(term234046, term234046.getClass(), "emitPending", term234047);
        setBooleanField(term234046, term234046.getClass(), "isEmitPending", true);
        setField(term234046, term234046.getClass(), "charBuffer", null);
        setField(term234046, term234046.getClass(), "dataBuffer", null);
        setField(term234046, term234046.getClass(), "tagPending", term234047);
        setField(term234046, term234046.getClass(), "doctypePending", null);
        setField(term234046, term234046.getClass(), "commentPending", null);
        setField(term234046, term234046.getClass(), "lastStartTag", term234047);
        setBooleanField(term234046, term234046.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term233062, args);
        assertTrue(recursiveEquals(term233062, term234046));
    }

};



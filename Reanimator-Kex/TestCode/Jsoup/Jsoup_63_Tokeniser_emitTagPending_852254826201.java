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

public class Tokeniser_emitTagPending_852254826201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199089;
     Object term199693;

    public Tokeniser_emitTagPending_852254826201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term199699 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term199698 = ((Class) term199699).getDeclaredField((String) "StartTag");
        ((Field) term199698).setAccessible(true);
        Object enum468 = ((Field) term199698).get((Object) null);
        term199089 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term199157 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term199331 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term199157, term199157.getClass(), "pendingAttributeName", null);
        setField(term199157, term199157.getClass(), "type", enum468);
        setField(term199089, term199089.getClass(), "tagPending", term199157);
        setBooleanField(term199089, term199089.getClass(), "isEmitPending", false);
        setField(term199089, term199089.getClass(), "emitPending", term199331);
        Class<? extends Object> term199890 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term199889 = ((Class) term199890).getDeclaredField((String) "StartTag");
        ((Field) term199889).setAccessible(true);
        Object enum469 = ((Field) term199889).get((Object) null);
        term199693 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term199694 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term199693, term199693.getClass(), "reader", null);
        setField(term199693, term199693.getClass(), "errors", null);
        setField(term199693, term199693.getClass(), "state", null);
        setField(term199694, term199694.getClass(), "tagName", null);
        setField(term199694, term199694.getClass(), "normalName", null);
        setField(term199694, term199694.getClass(), "pendingAttributeName", null);
        setField(term199694, term199694.getClass(), "pendingAttributeValue", null);
        setField(term199694, term199694.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term199694, term199694.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term199694, term199694.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term199694, term199694.getClass(), "selfClosing", false);
        setField(term199694, term199694.getClass(), "attributes", null);
        setField(term199694, term199694.getClass(), "type", enum469);
        setField(term199693, term199693.getClass(), "emitPending", term199694);
        setBooleanField(term199693, term199693.getClass(), "isEmitPending", true);
        setField(term199693, term199693.getClass(), "charsString", null);
        setField(term199693, term199693.getClass(), "charsBuilder", null);
        setField(term199693, term199693.getClass(), "dataBuffer", null);
        setField(term199693, term199693.getClass(), "tagPending", term199694);
        setField(term199693, term199693.getClass(), "startPending", null);
        setField(term199693, term199693.getClass(), "endPending", null);
        setField(term199693, term199693.getClass(), "charPending", null);
        setField(term199693, term199693.getClass(), "doctypePending", null);
        setField(term199693, term199693.getClass(), "commentPending", null);
        setField(term199693, term199693.getClass(), "lastStartTag", null);
        setBooleanField(term199693, term199693.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term199693, term199693.getClass(), "codepointHolder", null);
        setField(term199693, term199693.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term199089, args);
        assertTrue(recursiveEquals(term199089, term199693));
    }

};



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

public class Tokeniser_emitTagPending_852254826223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212853;
     Object term213480;

    public Tokeniser_emitTagPending_852254826223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term213488 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term213487 = ((Class) term213488).getDeclaredField((String) "EndTag");
        ((Field) term213487).setAccessible(true);
        Object enum479 = ((Field) term213487).get((Object) null);
        term212853 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term212917 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term213083 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term213151 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term212917, term212917.getClass(), "pendingAttributeName", null);
        setField(term212917, term212917.getClass(), "type", enum479);
        setField(term212917, term212917.getClass(), "attributes", term213083);
        setField(term212853, term212853.getClass(), "tagPending", term212917);
        setBooleanField(term212853, term212853.getClass(), "isEmitPending", false);
        setField(term212853, term212853.getClass(), "emitPending", null);
        setField(term212853, term212853.getClass(), "errors", term213151);
        Class<? extends Object> term213673 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term213672 = ((Class) term213673).getDeclaredField((String) "EndTag");
        ((Field) term213672).setAccessible(true);
        Object enum480 = ((Field) term213672).get((Object) null);
        term213480 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term213481 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term213482 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term213483 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term213480, term213480.getClass(), "reader", null);
        setIntField(term213481, term213481.getClass(), "maxSize", 0);
        setField(term213481, term213481.getClass(), "elementData", null);
        setIntField(term213481, term213481.getClass(), "size", 0);
        setIntField(term213481, term213481.getClass(), "modCount", 0);
        setField(term213480, term213480.getClass(), "errors", term213481);
        setField(term213480, term213480.getClass(), "state", null);
        setField(term213482, term213482.getClass(), "tagName", null);
        setField(term213482, term213482.getClass(), "normalName", null);
        setField(term213482, term213482.getClass(), "pendingAttributeName", null);
        setField(term213482, term213482.getClass(), "pendingAttributeValue", null);
        setField(term213482, term213482.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term213482, term213482.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term213482, term213482.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term213482, term213482.getClass(), "selfClosing", false);
        setField(term213483, term213483.getClass(), "attributes", null);
        setField(term213482, term213482.getClass(), "attributes", term213483);
        setField(term213482, term213482.getClass(), "type", enum480);
        setField(term213480, term213480.getClass(), "emitPending", term213482);
        setBooleanField(term213480, term213480.getClass(), "isEmitPending", true);
        setField(term213480, term213480.getClass(), "charsString", null);
        setField(term213480, term213480.getClass(), "charsBuilder", null);
        setField(term213480, term213480.getClass(), "dataBuffer", null);
        setField(term213480, term213480.getClass(), "tagPending", term213482);
        setField(term213480, term213480.getClass(), "startPending", null);
        setField(term213480, term213480.getClass(), "endPending", null);
        setField(term213480, term213480.getClass(), "charPending", null);
        setField(term213480, term213480.getClass(), "doctypePending", null);
        setField(term213480, term213480.getClass(), "commentPending", null);
        setField(term213480, term213480.getClass(), "lastStartTag", null);
        setBooleanField(term213480, term213480.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term213480, term213480.getClass(), "codepointHolder", null);
        setField(term213480, term213480.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term212853, args);
        assertTrue(recursiveEquals(term212853, term213480));
    }

};



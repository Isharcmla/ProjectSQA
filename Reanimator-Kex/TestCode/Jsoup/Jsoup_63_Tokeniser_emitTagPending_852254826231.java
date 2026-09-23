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
import java.lang.StringBuilder;

public class Tokeniser_emitTagPending_852254826231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216365;
     Object term216671;

    public Tokeniser_emitTagPending_852254826231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term216527 = new StringBuilder();
        term216365 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term216429 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term216429, term216429.getClass(), "pendingAttributeName", "");
        setField(term216429, term216429.getClass(), "attributes", null);
        setBooleanField(term216429, term216429.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term216429, term216429.getClass(), "hasPendingAttributeValue", false);
        setField(term216429, term216429.getClass(), "pendingAttributeValue", term216527);
        setField(term216365, term216365.getClass(), "tagPending", term216429);
        term216671 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term216672 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term216673 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term216674 = (byte[]) newByteArray(16);
        Object term216675 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term216671, term216671.getClass(), "reader", null);
        setField(term216671, term216671.getClass(), "errors", null);
        setField(term216671, term216671.getClass(), "state", null);
        setField(term216672, term216672.getClass(), "tagName", null);
        setField(term216672, term216672.getClass(), "normalName", null);
        setField(term216672, term216672.getClass(), "pendingAttributeName", null);
        setField(term216673, term216673.getClass(), "value", term216674);
        setByteField(term216673, term216673.getClass(), "coder", (byte) 0);
        setIntField(term216673, term216673.getClass(), "count", 0);
        setField(term216672, term216672.getClass(), "pendingAttributeValue", term216673);
        setField(term216672, term216672.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term216672, term216672.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term216672, term216672.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term216672, term216672.getClass(), "selfClosing", false);
        setField(term216675, term216675.getClass(), "attributes", null);
        setField(term216672, term216672.getClass(), "attributes", term216675);
        setField(term216672, term216672.getClass(), "type", null);
        setField(term216671, term216671.getClass(), "emitPending", term216672);
        setBooleanField(term216671, term216671.getClass(), "isEmitPending", true);
        setField(term216671, term216671.getClass(), "charsString", null);
        setField(term216671, term216671.getClass(), "charsBuilder", null);
        setField(term216671, term216671.getClass(), "dataBuffer", null);
        setField(term216671, term216671.getClass(), "tagPending", term216672);
        setField(term216671, term216671.getClass(), "startPending", null);
        setField(term216671, term216671.getClass(), "endPending", null);
        setField(term216671, term216671.getClass(), "charPending", null);
        setField(term216671, term216671.getClass(), "doctypePending", null);
        setField(term216671, term216671.getClass(), "commentPending", null);
        setField(term216671, term216671.getClass(), "lastStartTag", null);
        setBooleanField(term216671, term216671.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term216671, term216671.getClass(), "codepointHolder", null);
        setField(term216671, term216671.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term216365, args);
        assertTrue(recursiveEquals(term216365, term216671));
    }

};



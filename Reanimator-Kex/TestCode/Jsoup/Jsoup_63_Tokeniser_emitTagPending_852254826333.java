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
import java.util.LinkedHashMap;

public class Tokeniser_emitTagPending_852254826333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297316;
     Object term297617;

    public Tokeniser_emitTagPending_852254826333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term297536 = new LinkedHashMap();
        term297316 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term297380 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term297476 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term297380, term297380.getClass(), "pendingAttributeName", "");
        setField(term297476, term297476.getClass(), "attributes", term297536);
        setField(term297380, term297380.getClass(), "attributes", term297476);
        setBooleanField(term297380, term297380.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term297380, term297380.getClass(), "hasEmptyAttributeValue", false);
        setField(term297316, term297316.getClass(), "tagPending", term297380);
        LinkedHashMap term297620 = new LinkedHashMap();
        term297617 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term297618 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term297619 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term297617, term297617.getClass(), "reader", null);
        setField(term297617, term297617.getClass(), "errors", null);
        setField(term297617, term297617.getClass(), "state", null);
        setField(term297618, term297618.getClass(), "tagName", null);
        setField(term297618, term297618.getClass(), "normalName", null);
        setField(term297618, term297618.getClass(), "pendingAttributeName", null);
        setField(term297618, term297618.getClass(), "pendingAttributeValue", null);
        setField(term297618, term297618.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term297618, term297618.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term297618, term297618.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term297618, term297618.getClass(), "selfClosing", false);
        setField(term297619, term297619.getClass(), "attributes", term297620);
        setField(term297618, term297618.getClass(), "attributes", term297619);
        setField(term297618, term297618.getClass(), "type", null);
        setField(term297617, term297617.getClass(), "emitPending", term297618);
        setBooleanField(term297617, term297617.getClass(), "isEmitPending", true);
        setField(term297617, term297617.getClass(), "charsString", null);
        setField(term297617, term297617.getClass(), "charsBuilder", null);
        setField(term297617, term297617.getClass(), "dataBuffer", null);
        setField(term297617, term297617.getClass(), "tagPending", term297618);
        setField(term297617, term297617.getClass(), "startPending", null);
        setField(term297617, term297617.getClass(), "endPending", null);
        setField(term297617, term297617.getClass(), "charPending", null);
        setField(term297617, term297617.getClass(), "doctypePending", null);
        setField(term297617, term297617.getClass(), "commentPending", null);
        setField(term297617, term297617.getClass(), "lastStartTag", null);
        setBooleanField(term297617, term297617.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term297617, term297617.getClass(), "codepointHolder", null);
        setField(term297617, term297617.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "emitTagPending", argTypes, term297316, args);
        assertTrue(recursiveEquals(term297316, term297617));
    }

};



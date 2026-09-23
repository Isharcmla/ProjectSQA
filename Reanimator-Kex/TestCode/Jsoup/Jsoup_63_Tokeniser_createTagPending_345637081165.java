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

public class Tokeniser_createTagPending_345637081165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170767;
     Object term170973;
     Object term170944;

    public Tokeniser_createTagPending_345637081165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term170895 = new StringBuilder();
        term170767 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term170835 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term170835, term170835.getClass(), "tagName", null);
        setField(term170835, term170835.getClass(), "normalName", null);
        setField(term170835, term170835.getClass(), "pendingAttributeName", null);
        setField(term170835, term170835.getClass(), "pendingAttributeValue", term170895);
        setField(term170767, term170767.getClass(), "startPending", term170835);
        term170973 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term170974 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term170975 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term170976 = (byte[]) newByteArray(16);
        Object term170977 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term170973, term170973.getClass(), "reader", null);
        setField(term170973, term170973.getClass(), "errors", null);
        setField(term170973, term170973.getClass(), "state", null);
        setField(term170973, term170973.getClass(), "emitPending", null);
        setBooleanField(term170973, term170973.getClass(), "isEmitPending", false);
        setField(term170973, term170973.getClass(), "charsString", null);
        setField(term170973, term170973.getClass(), "charsBuilder", null);
        setField(term170973, term170973.getClass(), "dataBuffer", null);
        setField(term170974, term170974.getClass(), "tagName", null);
        setField(term170974, term170974.getClass(), "normalName", null);
        setField(term170974, term170974.getClass(), "pendingAttributeName", null);
        setField(term170975, term170975.getClass(), "value", term170976);
        setByteField(term170975, term170975.getClass(), "coder", (byte) 0);
        setIntField(term170975, term170975.getClass(), "count", 0);
        setField(term170974, term170974.getClass(), "pendingAttributeValue", term170975);
        setField(term170974, term170974.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term170974, term170974.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term170974, term170974.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term170974, term170974.getClass(), "selfClosing", false);
        setField(term170977, term170977.getClass(), "attributes", null);
        setField(term170974, term170974.getClass(), "attributes", term170977);
        setField(term170974, term170974.getClass(), "type", null);
        setField(term170973, term170973.getClass(), "tagPending", term170974);
        setField(term170973, term170973.getClass(), "startPending", term170974);
        setField(term170973, term170973.getClass(), "endPending", null);
        setField(term170973, term170973.getClass(), "charPending", null);
        setField(term170973, term170973.getClass(), "doctypePending", null);
        setField(term170973, term170973.getClass(), "commentPending", null);
        setField(term170973, term170973.getClass(), "lastStartTag", null);
        setBooleanField(term170973, term170973.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term170973, term170973.getClass(), "codepointHolder", null);
        setField(term170973, term170973.getClass(), "multipointHolder", null);
        term170944 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term170945 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term170946 = (byte[]) newByteArray(16);
        Object term170968 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term170944, term170944.getClass(), "tagName", null);
        setField(term170944, term170944.getClass(), "normalName", null);
        setField(term170944, term170944.getClass(), "pendingAttributeName", null);
        setField(term170945, term170945.getClass(), "value", term170946);
        setByteField(term170945, term170945.getClass(), "coder", (byte) 0);
        setIntField(term170945, term170945.getClass(), "count", 0);
        setField(term170944, term170944.getClass(), "pendingAttributeValue", term170945);
        setField(term170944, term170944.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term170944, term170944.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term170944, term170944.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term170944, term170944.getClass(), "selfClosing", false);
        setField(term170968, term170968.getClass(), "attributes", null);
        setField(term170944, term170944.getClass(), "attributes", term170968);
        setField(term170944, term170944.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = true;
        Object retValue = callMethod(klass, "createTagPending", argTypes, term170767, args);
        assertTrue(recursiveEquals(term170767, term170973));
        assertTrue(recursiveEquals(retValue, term170944));
    }

};



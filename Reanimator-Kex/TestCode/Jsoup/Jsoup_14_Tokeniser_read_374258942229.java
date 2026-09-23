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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.StringBuilder;

public class Tokeniser_read_374258942229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338638;
     Object term338942;

    public Tokeniser_read_374258942229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term338690 = new ArrayList();
        StringBuilder term338820 = new StringBuilder();
        term338638 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term338760 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setBooleanField(term338638, term338638.getClass(), "selfClosingFlagAcknowledged", false);
        setBooleanField(term338638, term338638.getClass(), "trackErrors", true);
        setField(term338638, term338638.getClass(), "errors", term338690);
        setIntField(term338760, term338760.getClass(), "pos", 0);
        setField(term338638, term338638.getClass(), "reader", term338760);
        setBooleanField(term338638, term338638.getClass(), "isEmitPending", true);
        setField(term338638, term338638.getClass(), "charBuffer", term338820);
        Object term338946 = newInstance(Class.forName("org.jsoup.parser.ParseError"));
        setField(term338946, term338946.getClass(), "errorMsg", "");
        setIntField(term338946, term338946.getClass(), "pos", 0);
        setCharField(term338946, term338946.getClass(), "c", (char) 0);
        setField(term338946, term338946.getClass(), "tokeniserState", null);
        setField(term338946, term338946.getClass(), "treeBuilderState", null);
        setField(term338946, term338946.getClass(), "token", null);
        ArrayList term338944 = new ArrayList();
        ((ArrayList) term338944).add(term338946);
        term338942 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term338943 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term338948 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term338949 = (byte[]) newByteArray(16);
        setField(term338943, term338943.getClass(), "input", null);
        setIntField(term338943, term338943.getClass(), "length", 0);
        setIntField(term338943, term338943.getClass(), "pos", 0);
        setIntField(term338943, term338943.getClass(), "mark", 0);
        setField(term338942, term338942.getClass(), "reader", term338943);
        setBooleanField(term338942, term338942.getClass(), "trackErrors", true);
        setField(term338942, term338942.getClass(), "errors", term338944);
        setField(term338942, term338942.getClass(), "state", null);
        setField(term338942, term338942.getClass(), "emitPending", null);
        setBooleanField(term338942, term338942.getClass(), "isEmitPending", false);
        setField(term338948, term338948.getClass(), "value", term338949);
        setByteField(term338948, term338948.getClass(), "coder", (byte) 0);
        setIntField(term338948, term338948.getClass(), "count", 0);
        setField(term338942, term338942.getClass(), "charBuffer", term338948);
        setField(term338942, term338942.getClass(), "dataBuffer", null);
        setField(term338942, term338942.getClass(), "tagPending", null);
        setField(term338942, term338942.getClass(), "doctypePending", null);
        setField(term338942, term338942.getClass(), "commentPending", null);
        setField(term338942, term338942.getClass(), "lastStartTag", null);
        setBooleanField(term338942, term338942.getClass(), "selfClosingFlagAcknowledged", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "read", argTypes, term338638, args);
        assertTrue(recursiveEquals(term338638, term338942));
        assertTrue(recursiveEquals(retValue, null));
    }

};



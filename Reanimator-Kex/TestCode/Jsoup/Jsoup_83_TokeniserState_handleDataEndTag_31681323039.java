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
import java.lang.StringBuilder;
import java.lang.Object;

public class TokeniserState_handleDataEndTag_31681323039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47738;
     Object term47868;
     Object term47916;
     Object term47917;

    public TokeniserState_handleDataEndTag_31681323039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term47798 = new StringBuilder();
        term47738 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term47738, term47738.getClass(), "lastStartTag", null);
        setField(term47738, term47738.getClass(), "dataBuffer", term47798);
        term47868 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term47868, term47868.getClass(), "bufPos", -2147483648);
        setIntField(term47868, term47868.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term47868, term47868.getClass(), "bufLength", -2147483648);
        term47916 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term47916, term47916.getClass(), "charBuf", null);
        setField(term47916, term47916.getClass(), "reader", null);
        setIntField(term47916, term47916.getClass(), "bufLength", -2147483648);
        setIntField(term47916, term47916.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term47916, term47916.getClass(), "bufPos", -2147483648);
        setIntField(term47916, term47916.getClass(), "readerPos", 0);
        setIntField(term47916, term47916.getClass(), "bufMark", 0);
        setField(term47916, term47916.getClass(), "stringCache", null);
        term47917 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term47920 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term47921 = (byte[]) newByteArray(16);
        setField(term47917, term47917.getClass(), "reader", null);
        setField(term47917, term47917.getClass(), "errors", null);
        setField(term47917, term47917.getClass(), "state", null);
        setField(term47917, term47917.getClass(), "emitPending", null);
        setBooleanField(term47917, term47917.getClass(), "isEmitPending", false);
        setField(term47917, term47917.getClass(), "charsString", "</");
        setField(term47917, term47917.getClass(), "charsBuilder", null);
        setField(term47920, term47920.getClass(), "value", term47921);
        setByteField(term47920, term47920.getClass(), "coder", (byte) 0);
        setIntField(term47920, term47920.getClass(), "count", 0);
        setField(term47917, term47917.getClass(), "dataBuffer", term47920);
        setField(term47917, term47917.getClass(), "tagPending", null);
        setField(term47917, term47917.getClass(), "startPending", null);
        setField(term47917, term47917.getClass(), "endPending", null);
        setField(term47917, term47917.getClass(), "charPending", null);
        setField(term47917, term47917.getClass(), "doctypePending", null);
        setField(term47917, term47917.getClass(), "commentPending", null);
        setField(term47917, term47917.getClass(), "lastStartTag", null);
        setField(term47917, term47917.getClass(), "codepointHolder", null);
        setField(term47917, term47917.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term47738;
        args[1] = term47868;
        args[2] = null;
        callMethod(klass, "handleDataEndTag", argTypes, null, args);
        assertTrue(recursiveEquals(term47738, term47916));
        assertTrue(recursiveEquals(term47868, term47917));
    }

};



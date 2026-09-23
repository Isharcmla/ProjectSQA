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

public class TokeniserState_handleDataEndTag_316813230203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315427;
     Object term315757;
     Object term321023;
     Object term321024;

    public TokeniserState_handleDataEndTag_316813230203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term315627 = new StringBuilder();
        char[] term314309 = (char[]) newCharArray(489);
        StringBuilder term315687 = new StringBuilder();
        ((StringBuilder) term315687).append(term314309);
        term315427 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term315529 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term315427, term315427.getClass(), "lastStartTag", "");
        setField(term315529, term315529.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term315427, term315427.getClass(), "tagPending", term315529);
        setField(term315427, term315427.getClass(), "dataBuffer", term315627);
        setField(term315427, term315427.getClass(), "charsString", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term315427, term315427.getClass(), "charsBuilder", term315687);
        term315757 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term315757, term315757.getClass(), "bufPos", -2147483648);
        setIntField(term315757, term315757.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term315757, term315757.getClass(), "bufLength", -2147483648);
        term321023 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term321023, term321023.getClass(), "charBuf", null);
        setField(term321023, term321023.getClass(), "reader", null);
        setIntField(term321023, term321023.getClass(), "bufLength", -2147483648);
        setIntField(term321023, term321023.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term321023, term321023.getClass(), "bufPos", -2147483648);
        setIntField(term321023, term321023.getClass(), "readerPos", 0);
        setIntField(term321023, term321023.getClass(), "bufMark", 0);
        setField(term321023, term321023.getClass(), "stringCache", null);
        term321024 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term321027 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term321028 = (byte[]) newByteArray(980);
        Object term321029 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term321030 = (byte[]) newByteArray(16);
        Object term321031 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term321024, term321024.getClass(), "reader", null);
        setField(term321024, term321024.getClass(), "errors", null);
        setField(term321024, term321024.getClass(), "state", null);
        setField(term321024, term321024.getClass(), "emitPending", null);
        setBooleanField(term321024, term321024.getClass(), "isEmitPending", false);
        setField(term321024, term321024.getClass(), "charsString", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setByteElement(term321028, 489, (byte) 60);
        setByteElement(term321028, 490, (byte) 47);
        setField(term321027, term321027.getClass(), "value", term321028);
        setByteField(term321027, term321027.getClass(), "coder", (byte) 0);
        setIntField(term321027, term321027.getClass(), "count", 491);
        setField(term321024, term321024.getClass(), "charsBuilder", term321027);
        setField(term321029, term321029.getClass(), "value", term321030);
        setByteField(term321029, term321029.getClass(), "coder", (byte) 0);
        setIntField(term321029, term321029.getClass(), "count", 0);
        setField(term321024, term321024.getClass(), "dataBuffer", term321029);
        setField(term321031, term321031.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term321031, term321031.getClass(), "normalName", null);
        setField(term321031, term321031.getClass(), "pendingAttributeName", null);
        setField(term321031, term321031.getClass(), "pendingAttributeValue", null);
        setField(term321031, term321031.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term321031, term321031.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term321031, term321031.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term321031, term321031.getClass(), "selfClosing", false);
        setField(term321031, term321031.getClass(), "attributes", null);
        setField(term321031, term321031.getClass(), "type", null);
        setField(term321024, term321024.getClass(), "tagPending", term321031);
        setField(term321024, term321024.getClass(), "startPending", null);
        setField(term321024, term321024.getClass(), "endPending", null);
        setField(term321024, term321024.getClass(), "charPending", null);
        setField(term321024, term321024.getClass(), "doctypePending", null);
        setField(term321024, term321024.getClass(), "commentPending", null);
        setField(term321024, term321024.getClass(), "lastStartTag", "");
        setField(term321024, term321024.getClass(), "codepointHolder", null);
        setField(term321024, term321024.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term315427;
        args[1] = term315757;
        args[2] = null;
        callMethod(klass, "handleDataEndTag", argTypes, null, args);
        assertTrue(recursiveEquals(term315427, term321023));
        assertTrue(recursiveEquals(term315757, term321024));
    }

};



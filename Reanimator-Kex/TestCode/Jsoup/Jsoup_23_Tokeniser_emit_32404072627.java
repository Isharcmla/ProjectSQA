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
import java.lang.StringIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Tokeniser_emit_32404072627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4005;

    public Tokeniser_emit_32404072627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33619 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term33618 = ((Class) term33619).getDeclaredField((String) "AttributeName");
        ((Field) term33618).setAccessible(true);
        Object enum109 = ((Field) term33618).get((Object) null);
        Class<? extends Object> term33900 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term33899 = ((Class) term33900).getDeclaredField((String) "Doctype");
        ((Field) term33899).setAccessible(true);
        Object enum110 = ((Field) term33899).get((Object) null);
        Class<? extends Object> term34104 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term34103 = ((Class) term34104).getDeclaredField((String) "Comment");
        ((Field) term34103).setAccessible(true);
        Object enum111 = ((Field) term34103).get((Object) null);
        Class<? extends Object> term34322 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term34321 = ((Class) term34322).getDeclaredField((String) "StartTag");
        ((Field) term34321).setAccessible(true);
        Object enum112 = ((Field) term34321).get((Object) null);
        term4005 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term4006 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term4022 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term4044 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term4045 = (byte[]) newByteArray(16);
        Object term4064 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term4065 = (byte[]) newByteArray(16);
        Object term4084 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term4085 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term4086 = (byte[]) newByteArray(16);
        Object term4105 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term4106 = (byte[]) newByteArray(16);
        Object term4125 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term4126 = (byte[]) newByteArray(16);
        Object term4157 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term4158 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term4159 = (byte[]) newByteArray(16);
        Object term4189 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term4227 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4006, term4006.getClass(), "input", "RMFIsYGgne");
        setIntField(term4006, term4006.getClass(), "length", -883034806);
        setIntField(term4006, term4006.getClass(), "pos", 1585847225);
        setIntField(term4006, term4006.getClass(), "mark", 597278769);
        setField(term4005, term4005.getClass(), "reader", term4006);
        setIntField(term4022, term4022.getClass(), "maxSize", 0);
        setField(term4022, term4022.getClass(), "elementData", null);
        setIntField(term4022, term4022.getClass(), "size", 0);
        setIntField(term4022, term4022.getClass(), "modCount", 0);
        setField(term4005, term4005.getClass(), "errors", term4022);
        setField(term4005, term4005.getClass(), "state", enum109);
        setField(term4005, term4005.getClass(), "emitPending", null);
        setBooleanField(term4005, term4005.getClass(), "isEmitPending", false);
        setField(term4044, term4044.getClass(), "value", term4045);
        setByteField(term4044, term4044.getClass(), "coder", (byte) 18);
        setIntField(term4044, term4044.getClass(), "count", -1685132342);
        setField(term4005, term4005.getClass(), "charBuffer", term4044);
        setField(term4064, term4064.getClass(), "value", term4065);
        setByteField(term4064, term4064.getClass(), "coder", (byte) -58);
        setIntField(term4064, term4064.getClass(), "count", -1456670397);
        setField(term4005, term4005.getClass(), "dataBuffer", term4064);
        setField(term4005, term4005.getClass(), "tagPending", null);
        setField(term4085, term4085.getClass(), "value", term4086);
        setByteField(term4085, term4085.getClass(), "coder", (byte) 0);
        setIntField(term4085, term4085.getClass(), "count", 0);
        setField(term4084, term4084.getClass(), "name", term4085);
        setField(term4105, term4105.getClass(), "value", term4106);
        setByteField(term4105, term4105.getClass(), "coder", (byte) 0);
        setIntField(term4105, term4105.getClass(), "count", 0);
        setField(term4084, term4084.getClass(), "publicIdentifier", term4105);
        setField(term4125, term4125.getClass(), "value", term4126);
        setByteField(term4125, term4125.getClass(), "coder", (byte) 0);
        setIntField(term4125, term4125.getClass(), "count", 0);
        setField(term4084, term4084.getClass(), "systemIdentifier", term4125);
        setBooleanField(term4084, term4084.getClass(), "forceQuirks", true);
        setField(term4084, term4084.getClass(), "type", enum110);
        setField(term4005, term4005.getClass(), "doctypePending", term4084);
        setField(term4158, term4158.getClass(), "value", term4159);
        setByteField(term4158, term4158.getClass(), "coder", (byte) 0);
        setIntField(term4158, term4158.getClass(), "count", 0);
        setField(term4157, term4157.getClass(), "data", term4158);
        setField(term4157, term4157.getClass(), "type", enum111);
        setField(term4005, term4005.getClass(), "commentPending", term4157);
        setField(term4189, term4189.getClass(), "tagName", "NRdvgJlhkX");
        setField(term4189, term4189.getClass(), "pendingAttributeName", "uuaPigETmJ");
        setField(term4189, term4189.getClass(), "pendingAttributeValue", "MxlszYVzRf");
        setBooleanField(term4189, term4189.getClass(), "selfClosing", false);
        setField(term4227, term4227.getClass(), "attributes", null);
        setField(term4189, term4189.getClass(), "attributes", term4227);
        setField(term4189, term4189.getClass(), "type", enum112);
        setField(term4005, term4005.getClass(), "lastStartTag", term4189);
        setBooleanField(term4005, term4005.getClass(), "selfClosingFlagAcknowledged", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LQFpaHEwXR";
        try {
            callMethod(klass, "emit", argTypes, term4005, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};



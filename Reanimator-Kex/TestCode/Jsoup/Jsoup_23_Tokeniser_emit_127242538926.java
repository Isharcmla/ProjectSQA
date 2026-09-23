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
import java.lang.IllegalArgumentException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Tokeniser_emit_127242538926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2853;

    public Tokeniser_emit_127242538926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32304 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term32303 = ((Class) term32304).getDeclaredField((String) "RCDATAEndTagOpen");
        ((Field) term32303).setAccessible(true);
        Object enum105 = ((Field) term32303).get((Object) null);
        Class<? extends Object> term32594 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term32593 = ((Class) term32594).getDeclaredField((String) "Doctype");
        ((Field) term32593).setAccessible(true);
        Object enum106 = ((Field) term32593).get((Object) null);
        Class<? extends Object> term32798 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term32797 = ((Class) term32798).getDeclaredField((String) "Comment");
        ((Field) term32797).setAccessible(true);
        Object enum107 = ((Field) term32797).get((Object) null);
        Class<? extends Object> term33016 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term33015 = ((Class) term33016).getDeclaredField((String) "StartTag");
        ((Field) term33015).setAccessible(true);
        Object enum108 = ((Field) term33015).get((Object) null);
        term2853 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term2854 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term2870 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term2895 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term2896 = (byte[]) newByteArray(16);
        Object term2915 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term2916 = (byte[]) newByteArray(16);
        Object term2935 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term2936 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term2937 = (byte[]) newByteArray(16);
        Object term2956 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term2957 = (byte[]) newByteArray(16);
        Object term2976 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term2977 = (byte[]) newByteArray(16);
        Object term3008 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term3009 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term3010 = (byte[]) newByteArray(16);
        Object term3040 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term3078 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2854, term2854.getClass(), "input", "EGtDIRbSSb");
        setIntField(term2854, term2854.getClass(), "length", 1227103734);
        setIntField(term2854, term2854.getClass(), "pos", -1339778481);
        setIntField(term2854, term2854.getClass(), "mark", 1725571209);
        setField(term2853, term2853.getClass(), "reader", term2854);
        setIntField(term2870, term2870.getClass(), "maxSize", 0);
        setField(term2870, term2870.getClass(), "elementData", null);
        setIntField(term2870, term2870.getClass(), "size", 0);
        setIntField(term2870, term2870.getClass(), "modCount", 0);
        setField(term2853, term2853.getClass(), "errors", term2870);
        setField(term2853, term2853.getClass(), "state", enum105);
        setField(term2853, term2853.getClass(), "emitPending", null);
        setBooleanField(term2853, term2853.getClass(), "isEmitPending", true);
        setField(term2895, term2895.getClass(), "value", term2896);
        setByteField(term2895, term2895.getClass(), "coder", (byte) 89);
        setIntField(term2895, term2895.getClass(), "count", -522618178);
        setField(term2853, term2853.getClass(), "charBuffer", term2895);
        setField(term2915, term2915.getClass(), "value", term2916);
        setByteField(term2915, term2915.getClass(), "coder", (byte) 75);
        setIntField(term2915, term2915.getClass(), "count", 1134449235);
        setField(term2853, term2853.getClass(), "dataBuffer", term2915);
        setField(term2853, term2853.getClass(), "tagPending", null);
        setField(term2936, term2936.getClass(), "value", term2937);
        setByteField(term2936, term2936.getClass(), "coder", (byte) 0);
        setIntField(term2936, term2936.getClass(), "count", 0);
        setField(term2935, term2935.getClass(), "name", term2936);
        setField(term2956, term2956.getClass(), "value", term2957);
        setByteField(term2956, term2956.getClass(), "coder", (byte) 0);
        setIntField(term2956, term2956.getClass(), "count", 0);
        setField(term2935, term2935.getClass(), "publicIdentifier", term2956);
        setField(term2976, term2976.getClass(), "value", term2977);
        setByteField(term2976, term2976.getClass(), "coder", (byte) 0);
        setIntField(term2976, term2976.getClass(), "count", 0);
        setField(term2935, term2935.getClass(), "systemIdentifier", term2976);
        setBooleanField(term2935, term2935.getClass(), "forceQuirks", true);
        setField(term2935, term2935.getClass(), "type", enum106);
        setField(term2853, term2853.getClass(), "doctypePending", term2935);
        setField(term3009, term3009.getClass(), "value", term3010);
        setByteField(term3009, term3009.getClass(), "coder", (byte) 0);
        setIntField(term3009, term3009.getClass(), "count", 0);
        setField(term3008, term3008.getClass(), "data", term3009);
        setField(term3008, term3008.getClass(), "type", enum107);
        setField(term2853, term2853.getClass(), "commentPending", term3008);
        setField(term3040, term3040.getClass(), "tagName", "SzjVpOQTyS");
        setField(term3040, term3040.getClass(), "pendingAttributeName", "MjGYSRKTNF");
        setField(term3040, term3040.getClass(), "pendingAttributeValue", "hRNSzYYIrc");
        setBooleanField(term3040, term3040.getClass(), "selfClosing", true);
        setField(term3078, term3078.getClass(), "attributes", null);
        setField(term3040, term3040.getClass(), "attributes", term3078);
        setField(term3040, term3040.getClass(), "type", enum108);
        setField(term2853, term2853.getClass(), "lastStartTag", term3040);
        setBooleanField(term2853, term2853.getClass(), "selfClosingFlagAcknowledged", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "emit", argTypes, term2853, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class Tokeniser_emit_127242538927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5137;

    public Tokeniser_emit_127242538927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term71194 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term71193 = ((Class) term71194).getDeclaredField((String) "ScriptDataDoubleEscapedDashDash");
        ((Field) term71193).setAccessible(true);
        Object enum288 = ((Field) term71193).get((Object) null);
        Class<? extends Object> term71449 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term71448 = ((Class) term71449).getDeclaredField((String) "AfterAfterBody");
        ((Field) term71448).setAccessible(true);
        Object enum289 = ((Field) term71448).get((Object) null);
        Object term5157 = newInstance(Class.forName("org.jsoup.parser.ParseError"));
        setField(term5157, term5157.getClass(), "errorMsg", "");
        setIntField(term5157, term5157.getClass(), "pos", -1685132342);
        setCharField(term5157, term5157.getClass(), "c", 'n');
        setField(term5157, term5157.getClass(), "tokeniserState", enum288);
        setField(term5157, term5157.getClass(), "treeBuilderState", enum289);
        setField(term5157, term5157.getClass(), "token", null);
        Class<? extends Object> term71663 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term71662 = ((Class) term71663).getDeclaredField((String) "BogusComment");
        ((Field) term71662).setAccessible(true);
        Object enum290 = ((Field) term71662).get((Object) null);
        Class<? extends Object> term71861 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term71860 = ((Class) term71861).getDeclaredField((String) "InBody");
        ((Field) term71860).setAccessible(true);
        Object enum291 = ((Field) term71860).get((Object) null);
        Object term5165 = newInstance(Class.forName("org.jsoup.parser.ParseError"));
        setField(term5165, term5165.getClass(), "errorMsg", "");
        setIntField(term5165, term5165.getClass(), "pos", -1456670397);
        setCharField(term5165, term5165.getClass(), "c", 'Z');
        setField(term5165, term5165.getClass(), "tokeniserState", enum290);
        setField(term5165, term5165.getClass(), "treeBuilderState", enum291);
        setField(term5165, term5165.getClass(), "token", null);
        Class<? extends Object> term72051 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term72050 = ((Class) term72051).getDeclaredField((String) "AttributeValue_doubleQuoted");
        ((Field) term72050).setAccessible(true);
        Object enum292 = ((Field) term72050).get((Object) null);
        Class<? extends Object> term72294 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term72293 = ((Class) term72294).getDeclaredField((String) "ForeignContent");
        ((Field) term72293).setAccessible(true);
        Object enum293 = ((Field) term72293).get((Object) null);
        Object term5173 = newInstance(Class.forName("org.jsoup.parser.ParseError"));
        setField(term5173, term5173.getClass(), "errorMsg", "");
        setIntField(term5173, term5173.getClass(), "pos", 1622346318);
        setCharField(term5173, term5173.getClass(), "c", 't');
        setField(term5173, term5173.getClass(), "tokeniserState", enum292);
        setField(term5173, term5173.getClass(), "treeBuilderState", enum293);
        setField(term5173, term5173.getClass(), "token", null);
        Class<? extends Object> term72508 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term72507 = ((Class) term72508).getDeclaredField((String) "AfterDoctypePublicIdentifier");
        ((Field) term72507).setAccessible(true);
        Object enum294 = ((Field) term72507).get((Object) null);
        Class<? extends Object> term72754 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term72753 = ((Class) term72754).getDeclaredField((String) "InHead");
        ((Field) term72753).setAccessible(true);
        Object enum295 = ((Field) term72753).get((Object) null);
        Object term5181 = newInstance(Class.forName("org.jsoup.parser.ParseError"));
        setField(term5181, term5181.getClass(), "errorMsg", "");
        setIntField(term5181, term5181.getClass(), "pos", 1048535127);
        setCharField(term5181, term5181.getClass(), "c", 'T');
        setField(term5181, term5181.getClass(), "tokeniserState", enum294);
        setField(term5181, term5181.getClass(), "treeBuilderState", enum295);
        setField(term5181, term5181.getClass(), "token", null);
        Class<? extends Object> term72944 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term72943 = ((Class) term72944).getDeclaredField((String) "ScriptData");
        ((Field) term72943).setAccessible(true);
        Object enum296 = ((Field) term72943).get((Object) null);
        Class<? extends Object> term73136 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term73135 = ((Class) term73136).getDeclaredField((String) "BeforeHead");
        ((Field) term73135).setAccessible(true);
        Object enum297 = ((Field) term73135).get((Object) null);
        Object term5189 = newInstance(Class.forName("org.jsoup.parser.ParseError"));
        setField(term5189, term5189.getClass(), "errorMsg", "");
        setIntField(term5189, term5189.getClass(), "pos", -655067527);
        setCharField(term5189, term5189.getClass(), "c", 'D');
        setField(term5189, term5189.getClass(), "tokeniserState", enum296);
        setField(term5189, term5189.getClass(), "treeBuilderState", enum297);
        setField(term5189, term5189.getClass(), "token", null);
        Class<? extends Object> term73338 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term73337 = ((Class) term73338).getDeclaredField((String) "PLAINTEXT");
        ((Field) term73337).setAccessible(true);
        Object enum298 = ((Field) term73337).get((Object) null);
        Class<? extends Object> term73527 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term73526 = ((Class) term73527).getDeclaredField((String) "InRow");
        ((Field) term73526).setAccessible(true);
        Object enum299 = ((Field) term73526).get((Object) null);
        Object term5197 = newInstance(Class.forName("org.jsoup.parser.ParseError"));
        setField(term5197, term5197.getClass(), "errorMsg", "");
        setIntField(term5197, term5197.getClass(), "pos", -6029667);
        setCharField(term5197, term5197.getClass(), "c", 's');
        setField(term5197, term5197.getClass(), "tokeniserState", enum298);
        setField(term5197, term5197.getClass(), "treeBuilderState", enum299);
        setField(term5197, term5197.getClass(), "token", null);
        Class<? extends Object> term73714 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term73713 = ((Class) term73714).getDeclaredField((String) "Rawtext");
        ((Field) term73713).setAccessible(true);
        Object enum300 = ((Field) term73713).get((Object) null);
        Class<? extends Object> term73897 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term73896 = ((Class) term73897).getDeclaredField((String) "InTableBody");
        ((Field) term73896).setAccessible(true);
        Object enum301 = ((Field) term73896).get((Object) null);
        Object term5205 = newInstance(Class.forName("org.jsoup.parser.ParseError"));
        setField(term5205, term5205.getClass(), "errorMsg", "");
        setIntField(term5205, term5205.getClass(), "pos", -2068769794);
        setCharField(term5205, term5205.getClass(), "c", 'j');
        setField(term5205, term5205.getClass(), "tokeniserState", enum300);
        setField(term5205, term5205.getClass(), "treeBuilderState", enum301);
        setField(term5205, term5205.getClass(), "token", null);
        Class<? extends Object> term74102 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term74101 = ((Class) term74102).getDeclaredField((String) "BeforeDoctypeName");
        ((Field) term74101).setAccessible(true);
        Object enum302 = ((Field) term74101).get((Object) null);
        Object term5213 = newInstance(Class.forName("org.jsoup.parser.ParseError"));
        setField(term5213, term5213.getClass(), "errorMsg", "");
        setIntField(term5213, term5213.getClass(), "pos", -117576464);
        setCharField(term5213, term5213.getClass(), "c", 'l');
        setField(term5213, term5213.getClass(), "tokeniserState", enum302);
        setField(term5213, term5213.getClass(), "treeBuilderState", enum289);
        setField(term5213, term5213.getClass(), "token", null);
        Class<? extends Object> term74315 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term74314 = ((Class) term74315).getDeclaredField((String) "DoctypeName");
        ((Field) term74314).setAccessible(true);
        Object enum303 = ((Field) term74314).get((Object) null);
        Class<? extends Object> term74510 = Class.forName((String) "org.jsoup.parser.TreeBuilderState");
        Field term74509 = ((Class) term74510).getDeclaredField((String) "InCaption");
        ((Field) term74509).setAccessible(true);
        Object enum304 = ((Field) term74509).get((Object) null);
        Object term5219 = newInstance(Class.forName("org.jsoup.parser.ParseError"));
        setField(term5219, term5219.getClass(), "errorMsg", "");
        setIntField(term5219, term5219.getClass(), "pos", -1007160944);
        setCharField(term5219, term5219.getClass(), "c", 'J');
        setField(term5219, term5219.getClass(), "tokeniserState", enum303);
        setField(term5219, term5219.getClass(), "treeBuilderState", enum304);
        setField(term5219, term5219.getClass(), "token", null);
        ArrayList term5155 = new ArrayList();
        ((ArrayList) term5155).add(term5157);
        ((ArrayList) term5155).add(term5165);
        ((ArrayList) term5155).add(term5173);
        ((ArrayList) term5155).add(term5181);
        ((ArrayList) term5155).add(term5189);
        ((ArrayList) term5155).add(term5197);
        ((ArrayList) term5155).add(term5205);
        ((ArrayList) term5155).add(term5213);
        ((ArrayList) term5155).add(term5219);
        Class<? extends Object> term74709 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term74708 = ((Class) term74709).getDeclaredField((String) "ScriptDataLessthanSign");
        ((Field) term74708).setAccessible(true);
        Object enum305 = ((Field) term74708).get((Object) null);
        term5137 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term5138 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term5138, term5138.getClass(), "input", "NRdvgJlhkX");
        setIntField(term5138, term5138.getClass(), "length", -883034806);
        setIntField(term5138, term5138.getClass(), "pos", 1585847225);
        setIntField(term5138, term5138.getClass(), "mark", 597278769);
        setField(term5137, term5137.getClass(), "reader", term5138);
        setBooleanField(term5137, term5137.getClass(), "trackErrors", true);
        setField(term5137, term5137.getClass(), "errors", term5155);
        setField(term5137, term5137.getClass(), "state", enum305);
        setField(term5137, term5137.getClass(), "emitPending", null);
        setBooleanField(term5137, term5137.getClass(), "isEmitPending", false);
        setField(term5137, term5137.getClass(), "charBuffer", null);
        setField(term5137, term5137.getClass(), "dataBuffer", null);
        setField(term5137, term5137.getClass(), "tagPending", null);
        setField(term5137, term5137.getClass(), "doctypePending", null);
        setField(term5137, term5137.getClass(), "commentPending", null);
        setField(term5137, term5137.getClass(), "lastStartTag", null);
        setBooleanField(term5137, term5137.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "emit", argTypes, term5137, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



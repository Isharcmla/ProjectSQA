package com.google.javascript.jscomp;

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
import java.util.MissingResourceException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class CommandLineRunner_createCompiler_117468361213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4185;

    public CommandLineRunner_createCompiler_117468361213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21903 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$DevMode");
        Field term21902 = ((Class) term21903).getDeclaredField((String) "OFF");
        ((Field) term21902).setAccessible(true);
        Object enum42 = ((Field) term21902).get((Object) null);
        ArrayList term4208 = new ArrayList();
        ArrayList term4212 = new ArrayList();
        ArrayList term4218 = new ArrayList();
        ArrayList term4245 = new ArrayList();
        ArrayList term4255 = new ArrayList();
        ArrayList term4259 = new ArrayList();
        ArrayList term4263 = new ArrayList();
        ArrayList term4267 = new ArrayList();
        Class<? extends Object> term22196 = Class.forName((String) "com.google.javascript.jscomp.CompilationLevel");
        Field term22195 = ((Class) term22196).getDeclaredField((String) "SIMPLE_OPTIMIZATIONS");
        ((Field) term22195).setAccessible(true);
        Object enum43 = ((Field) term22195).get((Object) null);
        Class<? extends Object> term22488 = Class.forName((String) "com.google.javascript.jscomp.WarningLevel");
        Field term22487 = ((Class) term22488).getDeclaredField((String) "DEFAULT");
        ((Field) term22487).setAccessible(true);
        Object enum44 = ((Field) term22487).get((Object) null);
        ArrayList term4310 = new ArrayList();
        ArrayList term4333 = new ArrayList();
        ArrayList term4337 = new ArrayList();
        ArrayList term4343 = new ArrayList();
        ArrayList term4362 = new ArrayList();
        Class<? extends Object> term22728 = Class.forName((String) "com.google.javascript.jscomp.SourceMap$DetailLevel");
        Field term22727 = ((Class) term22728).getDeclaredField((String) "ALL");
        ((Field) term22727).setAccessible(true);
        Object enum45 = ((Field) term22727).get((Object) null);
        ArrayList term4377 = new ArrayList();
        ArrayList term4381 = new ArrayList();
        ArrayList term4385 = new ArrayList();
        ArrayList term4389 = new ArrayList();
        ArrayList term4463 = new ArrayList();
        term4185 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner"));
        Object term4186 = newInstance(Class.forName("com.google.javascript.jscomp.CommandLineRunner$Flags"));
        Object term4319 = newInstance(Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner$CommandLineConfig"));
        Object term4356 = newInstance(Class.forName("com.google.javascript.jscomp.DefaultCodingConvention"));
        Object term4398 = newInstance(Class.forName("java.io.PrintStream"));
        Object term4401 = newInstance(Class.forName("java.util.Formatter"));
        Object term4402 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term4403 = (byte[]) newByteArray(16);
        Object term4422 = newInstance(Class.forName("java.util.Locale"));
        Object term4423 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object term4427 = newInstance(Class.forName("java.io.IOException"));
        Object[] term4428 = (Object[]) newArray("java.lang.Object", 5);
        Object[] term4430 = (Object[]) newArray("java.lang.StackTraceElement", 0);
        Object term4432 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term4435 = newInstance(Class.forName("java.io.BufferedWriter"));
        char[] term4436 = (char[]) newCharArray(2);
        char[] term4441 = (char[]) newCharArray(1);
        Object term4443 = newInstance(Class.forName("java.lang.Object"));
        Object term4444 = newInstance(Class.forName("java.io.OutputStreamWriter"));
        char[] term4445 = (char[]) newCharArray(9);
        Object term4455 = newInstance(Class.forName("java.lang.Object"));
        Object term4458 = newInstance(Class.forName("java.lang.Object"));
        Object term4459 = newInstance(Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner$RunTimeStats"));
        setBooleanField(term4186, term4186.getClass(), "display_help", true);
        setBooleanField(term4186, term4186.getClass(), "print_tree", false);
        setBooleanField(term4186, term4186.getClass(), "compute_phase_ordering", false);
        setBooleanField(term4186, term4186.getClass(), "print_ast", true);
        setBooleanField(term4186, term4186.getClass(), "print_pass_graph", false);
        setField(term4186, term4186.getClass(), "jscomp_dev_mode", enum42);
        setField(term4186, term4186.getClass(), "logging_level", "WARNING");
        setField(term4186, term4186.getClass(), "externs", term4208);
        setField(term4186, term4186.getClass(), "js", term4212);
        setField(term4186, term4186.getClass(), "js_output_file", "");
        setField(term4186, term4186.getClass(), "module", term4218);
        setField(term4186, term4186.getClass(), "variable_map_input_file", "");
        setField(term4186, term4186.getClass(), "property_map_input_file", "");
        setField(term4186, term4186.getClass(), "variable_map_output_file", "");
        setBooleanField(term4186, term4186.getClass(), "create_name_map_files", false);
        setField(term4186, term4186.getClass(), "property_map_output_file", "");
        setBooleanField(term4186, term4186.getClass(), "third_party", false);
        setIntField(term4186, term4186.getClass(), "summary_detail_level", 1);
        setField(term4186, term4186.getClass(), "output_wrapper", "");
        setField(term4186, term4186.getClass(), "output_wrapper_marker", "%output%");
        setField(term4186, term4186.getClass(), "module_wrapper", term4245);
        setField(term4186, term4186.getClass(), "module_output_path_prefix", "./");
        setField(term4186, term4186.getClass(), "create_source_map", "");
        setField(term4186, term4186.getClass(), "jscomp_error", term4255);
        setField(term4186, term4186.getClass(), "jscomp_warning", term4259);
        setField(term4186, term4186.getClass(), "jscomp_off", term4263);
        setField(term4186, term4186.getClass(), "define", term4267);
        setField(term4186, term4186.getClass(), "charset", "");
        setField(term4186, term4186.getClass(), "compilation_level", enum43);
        setField(term4186, term4186.getClass(), "warning_level", enum44);
        setBooleanField(term4186, term4186.getClass(), "use_only_custom_externs", false);
        setBooleanField(term4186, term4186.getClass(), "debug", true);
        setField(term4186, term4186.getClass(), "formatting", term4310);
        setBooleanField(term4186, term4186.getClass(), "process_closure_primitives", true);
        setBooleanField(term4186, term4186.getClass(), "manage_closure_dependencies", true);
        setField(term4186, term4186.getClass(), "output_manifest", "");
        setField(term4185, term4185.getClass(), "flags", term4186);
        setBooleanField(term4185, term4185.getClass(), "isConfigValid", false);
        setBooleanField(term4319, term4319.getClass(), "printTree", false);
        setBooleanField(term4319, term4319.getClass(), "computePhaseOrdering", true);
        setBooleanField(term4319, term4319.getClass(), "printAst", true);
        setBooleanField(term4319, term4319.getClass(), "printPassGraph", true);
        setField(term4319, term4319.getClass(), "jscompDevMode", enum42);
        setField(term4319, term4319.getClass(), "loggingLevel", "WARNING");
        setField(term4319, term4319.getClass(), "externs", term4333);
        setField(term4319, term4319.getClass(), "js", term4337);
        setField(term4319, term4319.getClass(), "jsOutputFile", "");
        setField(term4319, term4319.getClass(), "module", term4343);
        setField(term4319, term4319.getClass(), "variableMapInputFile", "");
        setField(term4319, term4319.getClass(), "propertyMapInputFile", "");
        setField(term4319, term4319.getClass(), "variableMapOutputFile", "");
        setBooleanField(term4319, term4319.getClass(), "createNameMapFiles", false);
        setField(term4319, term4319.getClass(), "propertyMapOutputFile", "");
        setField(term4319, term4319.getClass(), "codingConvention", term4356);
        setIntField(term4319, term4319.getClass(), "summaryDetailLevel", 1);
        setField(term4319, term4319.getClass(), "outputWrapper", "");
        setField(term4319, term4319.getClass(), "outputWrapperMarker", "");
        setField(term4319, term4319.getClass(), "moduleWrapper", term4362);
        setField(term4319, term4319.getClass(), "moduleOutputPathPrefix", "");
        setField(term4319, term4319.getClass(), "createSourceMap", "");
        setField(term4319, term4319.getClass(), "sourceMapDetailLevel", enum45);
        setField(term4319, term4319.getClass(), "jscompError", term4377);
        setField(term4319, term4319.getClass(), "jscompWarning", term4381);
        setField(term4319, term4319.getClass(), "jscompOff", term4385);
        setField(term4319, term4319.getClass(), "define", term4389);
        setField(term4319, term4319.getClass(), "charset", "");
        setBooleanField(term4319, term4319.getClass(), "manageClosureDependencies", false);
        setField(term4319, term4319.getClass(), "outputManifest", "");
        setField(term4185, term4185.getClass(), "config", term4319);
        setField(term4185, term4185.getClass(), "out", null);
        setBooleanField(term4398, term4398.getClass(), "autoFlush", false);
        setBooleanField(term4398, term4398.getClass(), "trouble", false);
        setField(term4402, term4402.getClass(), "value", term4403);
        setByteField(term4402, term4402.getClass(), "coder", (byte) 0);
        setIntField(term4402, term4402.getClass(), "count", 0);
        setField(term4401, term4401.getClass(), "a", term4402);
        setField(term4423, term4423.getClass(), "language", null);
        setField(term4423, term4423.getClass(), "script", null);
        setField(term4423, term4423.getClass(), "region", null);
        setField(term4423, term4423.getClass(), "variant", null);
        setIntField(term4423, term4423.getClass(), "hash", 96636889);
        setField(term4422, term4422.getClass(), "baseLocale", term4423);
        setField(term4422, term4422.getClass(), "localeExtensions", null);
        setIntField(term4422, term4422.getClass(), "hashCodeValue", 96636889);
        setField(term4422, term4422.getClass(), "languageTag", "");
        setField(term4401, term4401.getClass(), "l", term4422);
        setField(term4427, term4427.getClass(), "backtrace", term4428);
        setField(term4427, term4427.getClass(), "detailMessage", "");
        setField(term4427, term4427.getClass(), "cause", term4427);
        setField(term4427, term4427.getClass(), "stackTrace", term4430);
        setIntField(term4427, term4427.getClass(), "depth", 49);
        setIntField(term4432, term4432.getClass(), "modCount", 0);
        setField(term4427, term4427.getClass(), "suppressedExceptions", term4432);
        setField(term4401, term4401.getClass(), "lastException", term4427);
        setCharField(term4401, term4401.getClass(), "zero", (char) 48);
        setField(term4398, term4398.getClass(), "formatter", term4401);
        setField(term4435, term4435.getClass(), "out", null);
        setCharElement(term4436, 0, 't');
        setCharElement(term4436, 1, 'D');
        setField(term4435, term4435.getClass(), "cb", term4436);
        setIntField(term4435, term4435.getClass(), "nChars", 1725571209);
        setIntField(term4435, term4435.getClass(), "nextChar", -522618178);
        setCharElement(term4441, 0, 'I');
        setField(term4435, term4435.getClass(), "writeBuffer", term4441);
        setField(term4435, term4435.getClass(), "lock", term4443);
        setField(term4398, term4398.getClass(), "textOut", term4435);
        setField(term4444, term4444.getClass(), "se", null);
        setCharElement(term4445, 0, 'R');
        setCharElement(term4445, 1, 'b');
        setCharElement(term4445, 2, 'S');
        setCharElement(term4445, 3, 'S');
        setCharElement(term4445, 4, 'b');
        setCharElement(term4445, 5, 'S');
        setCharElement(term4445, 6, 'z');
        setCharElement(term4445, 7, 'j');
        setCharElement(term4445, 8, 'V');
        setField(term4444, term4444.getClass(), "writeBuffer", term4445);
        setField(term4444, term4444.getClass(), "lock", term4455);
        setField(term4398, term4398.getClass(), "charOut", term4444);
        setBooleanField(term4398, term4398.getClass(), "closing", false);
        setField(term4398, term4398.getClass(), "out", null);
        setBooleanField(term4398, term4398.getClass(), "closed", false);
        setField(term4398, term4398.getClass(), "closeLock", term4458);
        setField(term4185, term4185.getClass(), "err", term4398);
        setField(term4185, term4185.getClass(), "compiler", null);
        setLongField(term4459, term4459.getClass(), "bestRunTime", 4872422362414183754L);
        setLongField(term4459, term4459.getClass(), "worstRunTime", 6811161968424632369L);
        setLongField(term4459, term4459.getClass(), "lastStartTime", -7237588299778557629L);
        setField(term4459, term4459.getClass(), "loopedPassesInBestRun", term4463);
        setField(term4459, term4459.getClass(), "this$0", null);
        setField(term4185, term4185.getClass(), "runTimeStats", term4459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CommandLineRunner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "createCompiler", argTypes, term4185, args);
            assertTrue(false);
        }
        catch (MissingResourceException e) {
        }

    }

};



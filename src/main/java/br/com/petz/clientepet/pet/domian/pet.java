package br.com.petz.clientepet.pet.domian;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class pet {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idpet", updatable = false, unique = true, nullable = false)	
	private UUID idpet;
	@NotBlank
	private String nomePet;
	@Enumerated(EnumType.STRING)
	private Porte porte;
	@NotNull
	@Enumerated(EnumType.STRING)
	private TipoPet tipo;
	private String microchip;
	@NotBlank
	private String raca;
	@Enumerated(EnumType.STRING)
	@NotNull
	private SexoPet sexo;
	private String pelagemCor;
	@NotNull
	private LocalDate dataNascimento;
	private String rga;
	private Integer peso;
	
	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;

}